package com.testchn.springtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.testchn.springtest.dao.mapper.UserConfigMapper;
import com.testchn.springtest.model.entity.UserConfigEntity;
import com.testchn.springtest.service.IUserConfigService;
import org.springframework.stereotype.Service;

@Service
public class IUserConfigServiceImpl extends ServiceImpl<UserConfigMapper, UserConfigEntity> implements IUserConfigService {

}
