package com.flysoloing.commons.wrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * List类型返回结果类
 *
 * @author laitao
 * @date 2015-03-18 14:56:00
 */
public class ListResult<T> extends Result implements Serializable {

    private static final long serialVersionUID = -7450177725900417295L;

    private List<T> list = new ArrayList<T>();

    public ListResult() {
    }

    public ListResult(String code, String message) {
        super(code, message);
    }

    public ListResult(String code, String message, List<T> list) {
        super(code, message);
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public boolean add(T value) {
        return this.list.add(value);
    }

    public static <T> ListResult<T> build(String code, String message, List<T> list) {
        return new ListResult<>(code, message, list);
    }
}
