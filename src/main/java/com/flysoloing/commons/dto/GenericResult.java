package com.flysoloing.commons.dto;

import java.io.Serializable;

/**
 * 通用返回结果类
 *
 * @author laitao
 * @since 2015-03-18 14:54:00
 */
public class GenericResult<T> extends AbstractResult {

    private static final long serialVersionUID = 7563065399076181844L;

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
