package com.testchn.springtest.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.testchn.springtest.model.entity.UserInfoEntity;
import com.testchn.springtest.model.vo.UserInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserSessionMapper extends BaseMapper<UserInfoEntity> {
    @Select("select t1.t_user_name, t1.t_phone_num, t.* from t_user_session t left join t_user t1 on t.t_user_id = t1.t_user_id order by t.update_time desc ")
    List<UserInfoVo> getAllUserInfo();
}
