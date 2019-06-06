package com.cwj.music.entity;

import java.io.Serializable;

public class BaseMsg<T>{
    /**
     * 结果提示
     */
    private String Msg;
    /**
     * 1101 正确
     * 1102 错误
     */
    private String Code;

    private T  body;

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }




}
