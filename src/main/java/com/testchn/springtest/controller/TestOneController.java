package com.testchn.springtest.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.testchn.springtest.common.vo.CommonPageRelsult;
import com.testchn.springtest.common.vo.CommonResult;
import com.testchn.springtest.entity.UserEntity;
import com.testchn.springtest.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping("/user")
public class TestOneController {
    @Autowired
    private TestOneService userService;
//    @GetMapping("list")
    @GetMapping
    public CommonResult<CommonPageRelsult> list(){

//        return CommonResult.result();
//        CommonPageRelsult t = new CommonPageRelsult();
//        List l = new ArrayList();
//        l.add("hah");
//        l.add("22");
//        t.setRows(list);
        PageHelper.startPage(1,5);
        List<UserEntity> list = userService.getList();
        PageInfo<UserEntity> pageInfo = new PageInfo<UserEntity>(list);
        return CommonResult.success("test",  CommonPageRelsult.toPage(pageInfo));
    }
    @PostMapping
    public CommonResult<?> insert(@RequestBody UserEntity user){
        return CommonResult.success("test",userService.insert(user));
    }
}
