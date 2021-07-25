package com.testchn.springtest.controller;


import com.testchn.springtest.common.vo.CommonPageRelsult;
import com.testchn.springtest.common.vo.CommonResult;
import com.testchn.springtest.entity.UserEntity;
import com.testchn.springtest.service.TestOneService;
import com.testchn.springtest.service.impl.TestOneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class TestOneController {
    @Autowired
    private TestOneService userService;
    @RequestMapping("list")
    public CommonResult<CommonPageRelsult> getUser(){

        List<UserEntity> list = userService.getList();
//        return CommonResult.result();
        CommonPageRelsult t = new CommonPageRelsult();
        List l = new ArrayList();
        l.add("hah");
        l.add("22");
        t.setRows(list);
        return CommonResult.success("test",  t);
    }
}
