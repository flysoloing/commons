package com.flysoloing.commons.wrapper;

import com.flysoloing.commons.pagination.Pagination;

import java.io.Serializable;

/**
 * 带分页的返回结果类
 *
 * @author laitao
 * @date 2015-03-18 15:53:00
 */
public class PaginationResult<T> extends ListResult<T> implements Serializable {

    private static final long serialVersionUID = -8701260818087056485L;

    private Pagination pagination;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
