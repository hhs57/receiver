package com.province.receive.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultModel<T> implements Serializable {

    private static final long serialVersionUID = -1372630893372923218L;

    private int code;
    private String message;
    private T data;

    public static <T> ResultModel<T> create(int code, String message) {
        return new ResultModel(code, message, null);
    }

    public static <T> ResultModel<T> create(int code, String message, T data) {
        return new ResultModel(code, message, data);
    }

    public static <T> ResultModel<T> success() {
        return successMessage(ResultCodeEnum.SUCCESS.getDefaultMessage());
    }

    public static <T> ResultModel<T> successMessage(String message) {
        return successData(message, null);
    }

    public static <T> ResultModel<T> successData(String message, T data) {
        return create(ResultCodeEnum.SUCCESS.getCode(), message, data);
    }

    ResultModel(int code, String message, T data) {
        setCode(code);
        setMessage(message);
        setData(data);
    }

    public static ResultModel create(ResultCodeEnum codeEnum) {
        return create(codeEnum.getCode(), codeEnum.getDefaultMessage());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
