package com.testchn.springtest.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.testchn.springtest.common.vo.CommonPageRelsult;
import com.testchn.springtest.common.vo.CommonResult;
import com.testchn.springtest.common.vo.UserInfoVo;
import com.testchn.springtest.dao.mapper.UserSessionMapper;
import com.testchn.springtest.entity.UserEntity;
import com.testchn.springtest.service.TestOneService;
import com.testchn.springtest.service.impl.TestOneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class TestOneController {
    @Autowired
    private TestOneService userService;
//    @GetMapping("list")

    /***
     * 查询用户相关数据
     * @return
     */
    @GetMapping
    public CommonResult<CommonPageRelsult> list(){

        //List<UserEntity> list = userService.getList();
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
    /***
     * 插入用户数据
     */
    @PostMapping
    public CommonResult<?> insertUser(@RequestBody UserEntity user){
        return CommonResult.success("用户数据插入",userService.insert(user));
    }

    /***
     * 插入用户需要存储的信息
     * @param userInfo
     * @return
     */
    @PostMapping("insert")
    public CommonResult<?> insertUserInfo(@RequestBody UserInfoVo userInfo){

        return CommonResult.success("用户相关信息插入",userService.insertUserInfo(userInfo));
    }
}
