package com.testchn.springtest.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@TableName(value = "t_user")
public class UserEntity {

    @TableId(value = "id")
    private int id;
    @JsonProperty("tUserName")
    @TableId(value = "t_user_name")
    private String tUserName;
    @JsonProperty("tUserId")
    @TableId(value = "t_user_id")
    private String tUserId;
    @TableId(value = "user_exts")
    private String userExts;
}
