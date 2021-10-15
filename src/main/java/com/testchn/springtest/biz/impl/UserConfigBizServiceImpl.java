package com.testchn.springtest.biz.impl;

import com.testchn.springtest.biz.UserConfigBizService;
import com.testchn.springtest.model.entity.UserConfigEntity;
import com.testchn.springtest.model.param.UserConfigParam;
import com.testchn.springtest.service.IUserConfigService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserConfigBizServiceImpl implements UserConfigBizService {

    @Autowired
    private IUserConfigService IUserConfigService;
    @Override
    public List<UserConfigEntity> listUserConfig() {
        return IUserConfigService.list();
    }

    @Override
    public boolean saveUserConfig(UserConfigParam userConfigParam) {
        UserConfigEntity userConfigEntity = new UserConfigEntity();
        BeanUtils.copyProperties(userConfigParam, userConfigEntity);
        return IUserConfigService.save(userConfigEntity);
    }
}
