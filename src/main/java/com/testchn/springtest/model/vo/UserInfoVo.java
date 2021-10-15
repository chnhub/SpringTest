package com.testchn.springtest.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

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
    @JsonProperty("tUserName")
    private String tUserName;
    @JsonProperty("tPhoneNum")
    private String tPhoneNum;
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
    /***
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
