package com.testchn.springtest.common.util;


import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = { ElementType.TYPE, ElementType.METHOD })   //说明次注解可以作用于类和方法
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    /**
     * 获取被注解方法的参数
     *
     * */
    String value() default "";    //方法名称自己定义，返回值根据需要
    String datasource() default "test";

}
