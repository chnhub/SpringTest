package com.testchn.springtest.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_config")
public class UserConfigEntity {
    /***
     * 唯一id
     */
    private long id;
    /***
     * 参数名字
     */
    private String paramName;
    /***
     * 参数唯一键
     */
    private String paramKey;
    /***
     * 参数值
     */
    private String paramValue;
    /***
     * 参数描述
     */
    private String paramDesc;
    /***
     * 状态
     */
    private String status;
}
