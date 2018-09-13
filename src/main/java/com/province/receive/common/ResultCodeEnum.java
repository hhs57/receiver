package com.province.receive.common;

/****
 *
 * @fileName ResultCodeEnum
 * @package com.speech.scan.common.model
 * @description
 * @author Administrator
 * @date 2018-08-08 18:00
 */


public enum ResultCodeEnum {


    //0 为操作成功
    SUCCESS(0, "操作成功"),

    //1 为操作失败
    ERROR(1, "操作失败"),

    //2 为参数错误
    VALID_PARAM_ERROR(2, "参数错误"),

    //51 为系统异常
    INTERNAL_SERVER_ERROR(51, "系统异常");

    private int code;
    private String defaultMessage;

    private ResultCodeEnum(int code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }


    public int getCode() {
        return code;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }


}
