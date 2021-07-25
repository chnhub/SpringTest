package com.testchn.springtest.dao;

import com.testchn.springtest.entity.UserEntity;

import java.util.List;

public interface TestOneDao {
    List<UserEntity> select();
}
