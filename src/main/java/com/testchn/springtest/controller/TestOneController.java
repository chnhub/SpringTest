package com.testchn.springtest.controller;


import com.testchn.springtest.common.vo.CommonPageRelsult;
import com.testchn.springtest.common.vo.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class TestOneController {
    @RequestMapping("test")
    public CommonResult<CommonPageRelsult> getUser(){

//        return CommonResult.result();
        CommonPageRelsult t = new CommonPageRelsult();
        List l = new ArrayList();
        l.add("hah");
        l.add("22");
        t.setRows(l);
        return CommonResult.success("test", t);
    }
}
