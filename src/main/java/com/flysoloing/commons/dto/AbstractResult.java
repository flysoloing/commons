package com.flysoloing.commons.dto;

import java.io.Serializable;

/**
 * 返回结果抽象类
 *
 * @author laitao
 * @date 2015-03-18 14:48:00
 */
public abstract class AbstractResult implements Serializable{

    private static final long serialVersionUID = -1287608281043535386L;

    /**
     * 结果编码
     */
    private String code;
    /**
     * 结果信息
     */
    private String message;

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
