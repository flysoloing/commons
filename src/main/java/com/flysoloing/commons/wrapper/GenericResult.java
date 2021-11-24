package com.flysoloing.commons.wrapper;

import java.io.Serializable;

/**
 * 通用返回结果类
 *
 * @author laitao
 * @date 2015-03-18 14:54:00
 */
public class GenericResult<T> extends Result implements Serializable {

    private static final long serialVersionUID = -1342094832750370935L;

    private T value;

    public GenericResult() {
    }

    public GenericResult(String code, String message) {
        super(code, message);
    }

    public GenericResult(String code, String message, T value) {
        super(code, message);
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> GenericResult<T> build(String code, String message, T value) {
        return new GenericResult<>(code, message, value);
    }
}
