package com.testchn.springtest.common;

import com.testchn.springtest.model.vo.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.AccessDeniedException;

/***
 * 全局异常类
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常,没有权限
     *
     * @param request
     * @param e
     * @return
     */
//    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    @ExceptionHandler(value = AccessDeniedException.class)
    @ResponseBody
    public Object AccessExceptionHandler(HttpServletRequest request, AccessDeniedException e) {
        logger.error("发生业务异常！原因是：{},\n 具体错误在 {}", e, e.getStackTrace()[0] + "" + e.getStackTrace()[1]);
        return CommonResult.result(403, "没有权限访问", null);
    }

    /**
     * 运行时异常的
     *
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest request, RuntimeException e) {
//        [0]
        logger.error("发现运行时业务异常！原因是：{},\n 具体错误在 {}", e, e.getStackTrace()[0] + "" + e.getStackTrace()[1]);
        return CommonResult.result(1, e.getMessage(), null);
    }


    /**
     * 404 异常
     *
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return (factory -> {
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
            factory.addErrorPages(error404Page);
        });
    }

}
