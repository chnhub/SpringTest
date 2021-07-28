package com.testchn.springtest.service;

import com.testchn.springtest.common.vo.UserInfoVo;
import com.testchn.springtest.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
public interface TestOneService {
    public List<UserEntity> getList();

    public int insert(UserEntity user);
    public int insertUserInfo(UserInfoVo userInfo);
}
