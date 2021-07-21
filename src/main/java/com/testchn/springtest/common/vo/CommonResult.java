package com.testchn.springtest.common.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;
    private boolean success;

    @SuppressWarnings("unused")
    private CommonResult () {

    }
    public CommonResult(Type type,String msg) {
        this.code = type.value;
        this.message = msg;
    }
    public CommonResult(Type type,String msg,T data) {
        this.code = type.value;
        this.message = msg;
        this.data = data;
    }
    public CommonResult(int code,String msg, T data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }
    public enum Type {
        SUCCESS(0),
        FAIL(99999999)
        ;
        private final int value;
        Type(int value) {
            this.value = value;
        }
    }
    /**
     * 返回成功
     * @param msg
     * @param data
     * @return
     */
    public static <T> CommonResult<T> success(String msg,T data) {
        return new CommonResult<T>(Type.SUCCESS, msg, data);
    }
    /**
     * 返回成功
     * @param data
     * @return
     */
    public static <T> CommonResult<T> success(T data) {
        return success("操作成功",data);
    }
    /**
     * 返回成功
     * @return
     */
    public static <T> CommonResult<T> success() {
        return success("操作成功", null);
    }
    /**
     * 返回失败
     * @param msg
     * @param data
     * @return
     */
    public static <T> CommonResult<T> fail(String msg,T data) {
        return new CommonResult<T>(Type.FAIL, msg, data);
    }

    public static <T> CommonResult<T> result(int code, String msg, T data) {
        return new CommonResult<T>(code, msg, data);
    }
    /**
     * 返回失败
     * @param data
     * @return
     */
    public static <T> CommonResult<T> fail(T data) {
        return fail("操作失败",data);
    }
    /**
     * 返回失败
     * @return
     */
    public static <T> CommonResult<T> fail() {
        return fail("操作失败", null);
    }
    // 省略 get set
}
