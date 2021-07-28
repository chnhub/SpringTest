package com.testchn.springtest.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/***
 * 用户需要存储的信息
 */
@Data
public class UserInfoVo {
    /***
     *  用户的ID
     */
    @JsonProperty("tUserId")
    private long tUserId;
    /***
     * 用户要存的key
     */
    @JsonProperty("tKey")
    private String tKey;
    /***
     * 用户要存的value
     */
    @JsonProperty("tValue")
    private String tValue;
    /***
     * 页面的url
     */
    @JsonProperty("tUrl")
    private String tUrl;
}
