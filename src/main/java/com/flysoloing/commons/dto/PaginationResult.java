package com.flysoloing.commons.dto;

import com.flysoloing.commons.pagination.Pagination;

import java.io.Serializable;

/**
 * 带分页的返回结果类
 *
 * @author laitao
 * @date 2015-03-18 15:53:00
 */
public class PaginationResult<T> extends ListResult<T> {

    private static final long serialVersionUID = -4232076347819071998L;

    private Pagination pagination;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
