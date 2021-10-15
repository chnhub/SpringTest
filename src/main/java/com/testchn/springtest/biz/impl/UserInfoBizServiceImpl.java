package com.testchn.springtest.biz.impl;

import com.testchn.springtest.biz.UserInfoBizService;
import com.testchn.springtest.model.vo.UserInfoVo;
import com.testchn.springtest.dao.mapper.TestOneMapper;
import com.testchn.springtest.dao.mapper.UserSessionMapper;
import com.testchn.springtest.model.entity.UserEntity;
import com.testchn.springtest.model.entity.UserInfoEntity;
import com.testchn.springtest.service.IUserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoBizServiceImpl implements UserInfoBizService {
    @Autowired
    private TestOneMapper testOneMapper;
    @Autowired
    private UserSessionMapper userSessionMapper;

    @Autowired
    private IUserInfoService iUserInfoService;

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
    public boolean insertUserInfo(UserInfoVo userInfo) {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        BeanUtils.copyProperties(userInfo, userInfoEntity);
        return iUserInfoService.save(userInfoEntity);
    }

    @Override
    public List<UserInfoVo> infoList() {
        UserInfoEntity userInfoEntity = new UserInfoEntity();

        //iUserInfoService.list(userInfoEntity);
        return userSessionMapper.getAllUserInfo();
    }


}
