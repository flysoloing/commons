package com.flysoloing.commons.dto;

import com.flysoloing.commons.pagination.Pagination;

import java.io.Serializable;

/**
 * 带分页条件查询类
 *
 * @author laitao
 * @date 2015-03-18 15:59:00
 */
public class PaginationQuery<T> extends Query<T> {

    private static final long serialVersionUID = -1491545892015755135L;

    private Pagination pagination;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
