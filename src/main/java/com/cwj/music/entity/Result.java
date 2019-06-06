package com.cwj.music.entity;

import java.util.List;

public class Result<T> {
    private int code;//状态码
    private String msg;//信息
    private T data;//


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
