package com.testchn.springtest.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.testchn.springtest.biz.UserConfigBizService;
import com.testchn.springtest.model.entity.UserConfigEntity;
import com.testchn.springtest.model.entity.UserEntity;
import com.testchn.springtest.model.param.UserConfigParam;
import com.testchn.springtest.model.vo.CommonPageRelsult;
import com.testchn.springtest.model.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * 用户配置接口
 */
@RestController
@RequestMapping("/config")
public class UserConfigController {
    @Autowired
    private UserConfigBizService userConfigBizService;

    @GetMapping("/list")
    public CommonResult<?> list(){

        PageHelper.startPage(1,5);
        List<UserConfigEntity> list = userConfigBizService.listUserConfig();
        PageInfo<UserConfigEntity> pageInfo = new PageInfo<UserConfigEntity>(list);
        return CommonResult.success("查询配置列表",  CommonPageRelsult.toPage(pageInfo));
    }
    @PostMapping("/save")
    public CommonResult<?> save(@RequestBody UserConfigParam userConfigParam){

        return CommonResult.result(0,"插入配置信息", userConfigBizService.saveUserConfig(userConfigParam));
    }
}
