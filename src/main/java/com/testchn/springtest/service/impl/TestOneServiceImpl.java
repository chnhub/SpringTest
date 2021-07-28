package com.testchn.springtest.service.impl;

import com.testchn.springtest.common.vo.UserInfoVo;
import com.testchn.springtest.dao.mapper.TestOneMapper;
import com.testchn.springtest.dao.mapper.UserSessionMapper;
import com.testchn.springtest.entity.UserEntity;
import com.testchn.springtest.entity.UserInfoEntity;
import com.testchn.springtest.service.TestOneService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestOneServiceImpl implements TestOneService {
    @Autowired
    private TestOneMapper testOneMapper;
    @Autowired
    private UserSessionMapper userSessionMapper;

    @Override
    public List<UserEntity> getList() {
//        UserEntity user = testOneMapper.selectById(1L);
        List<UserEntity> userList = testOneMapper.selectList(null);

        return userList;
    }

    @Override
    public int insert(UserEntity user) {
        return testOneMapper.insert(user);
    }

    @Override
    public int insertUserInfo(UserInfoVo userInfo) {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        BeanUtils.copyProperties(userInfo, userInfoEntity);
        return userSessionMapper.insert(userInfoEntity);
    }

}
