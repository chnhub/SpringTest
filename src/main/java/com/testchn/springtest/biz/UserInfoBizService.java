package com.testchn.springtest.biz;

import com.testchn.springtest.model.vo.UserInfoVo;
import com.testchn.springtest.model.entity.UserEntity;

import java.util.List;

public interface UserInfoBizService {
    public List<UserEntity> getList();

    public int insert(UserEntity user);
    public boolean insertUserInfo(UserInfoVo userInfo);
    public List<UserInfoVo> infoList();

}
