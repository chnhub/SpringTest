package com.testchn.springtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.testchn.springtest.dao.mapper.UserSessionMapper;
import com.testchn.springtest.model.entity.UserInfoEntity;
import com.testchn.springtest.service.IUserInfoService;
import org.springframework.stereotype.Service;

@Service
public class IUserInfoServiceImpl extends ServiceImpl<UserSessionMapper, UserInfoEntity> implements IUserInfoService {
}
