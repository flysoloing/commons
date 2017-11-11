package com.flysoloing.commons.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * List类型返回结果类
 *
 * @author laitao
 * @since 2015-03-18 14:56:00
 */
public class ListResult<E> extends AbstractResult {

    private static final long serialVersionUID = 8050996165159782115L;

    private List<E> list = new ArrayList<E>();

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public boolean add(E e) {
        return this.list.add(e);
    }

    public E remove(int index) {
        return this.list.remove(index);
    }

    public boolean remove(Object o) {
        return this.list.remove(o);
    }

    public E get(int index) {
        return this.list.get(index);
    }
}
