package com.testchn.springtest.service.impl;

import com.testchn.springtest.dao.mapper.TestOneMapper;
import com.testchn.springtest.entity.UserEntity;
import com.testchn.springtest.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestOneServiceImpl implements TestOneService {
    @Autowired
    private TestOneMapper testOneMapper;
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
}
