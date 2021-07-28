package com.testchn.springtest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_user_session")
@Data
public class UserInfoEntity {
    /***
     * 本地库用户id
     */
    private long userId;
    /***
     * 目标页面用户id
     */
    @TableField("t_user_id")
    private long tUserId;
    /***
     * 字段名
     */
    @TableField("t_key")
    private String tKey;
    /***
     * 字段值
     */
    @TableField("t_value")
    private String tValue;
    /***
     * 页面url
     */
    @TableField("t_url")
    private String tUrl;


}
