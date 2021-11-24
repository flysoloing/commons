package com.flysoloing.commons.wrapper;

import java.io.Serializable;

/**
 * 基础返回结果类
 *
 * @author laitao
 * @date 2015-03-18 14:52:34
 */
public class BasicResult extends Result implements Serializable {

    private static final long serialVersionUID = 1425589652792359471L;

    public BasicResult() {
    }

    public BasicResult(String code, String message) {
        super(code, message);
    }

    public static BasicResult build(String code, String message) {
        return new BasicResult(code, message);
    }
}
