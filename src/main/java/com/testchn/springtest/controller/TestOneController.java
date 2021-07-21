package com.testchn.springtest.controller;


import com.testchn.springtest.common.vo.CommonPageRelsult;
import com.testchn.springtest.common.vo.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestOneController {
    @RequestMapping("test")
    public CommonResult<CommonPageRelsult> getUser(){


//        return CommonResult.result();
        return null;
    }
}
