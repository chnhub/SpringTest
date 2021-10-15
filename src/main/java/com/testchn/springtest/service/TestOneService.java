package com.testchn.springtest.service;

import com.testchn.springtest.model.vo.UserInfoVo;
import com.testchn.springtest.model.entity.UserEntity;

import java.util.List;
public interface TestOneService {
    public List<UserEntity> getList();

    public int insert(UserEntity user);
    public int insertUserInfo(UserInfoVo userInfo);
}
