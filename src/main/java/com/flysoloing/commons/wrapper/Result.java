package com.flysoloing.commons.wrapper;

import java.io.Serializable;

/**
 * 返回结果抽象类
 *
 * @author laitao
 * @date 2015-03-18 14:48:33
 */
public abstract class Result implements Serializable {

    private String code;

    private String message;

    public Result() {
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
