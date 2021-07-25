package com.testchn.springtest.service;

import com.testchn.springtest.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
public interface TestOneService {
    public List<UserEntity> getList();
}
