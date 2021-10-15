package com.testchn.springtest.model.param;

import lombok.Data;

@Data
public class UserConfigParam {
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
}
