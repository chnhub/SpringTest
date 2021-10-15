package com.testchn.springtest.biz;

import com.testchn.springtest.model.entity.UserConfigEntity;
import com.testchn.springtest.model.param.UserConfigParam;

import java.util.List;

public interface UserConfigBizService {
    public List<UserConfigEntity> listUserConfig();
    public boolean saveUserConfig(UserConfigParam userConfigParam);
}
