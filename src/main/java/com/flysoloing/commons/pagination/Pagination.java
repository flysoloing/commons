package com.flysoloing.commons.pagination;

import java.io.Serializable;

/**
 * 分页条件类
 *
 * @author laitao
 * @date 2015-03-18 15:45:00
 */
public class Pagination implements Serializable {

    private static final long serialVersionUID = 743475068647030246L;

    private static final int DEFAULT_INDEX_OFFSET = 3;

    /**
     * 总记录条数
     */
    private int totalRecord;
    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     * 当前页码
     */
    private int currentIndex;
    /**
     * 页面偏移量，默认为3,。例如：为2时，当前页面的前2和后2都显示
     */
    private int indexOffset;
    /**
     * 总页数
     */
    private int totalPage;

    public Pagination(int totalRecord, int pageSize, int currentIndex) {
        this(totalRecord, pageSize, currentIndex, DEFAULT_INDEX_OFFSET);
    }

    public Pagination(int totalRecord, int pageSize, int currentIndex, int indexOffset) {
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
        this.currentIndex = currentIndex;
        this.indexOffset = indexOffset;
        this.totalPage = (totalRecord + pageSize - 1) / pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public int getIndexOffset() {
        return indexOffset;
    }

    public void setIndexOffset(int indexOffset) {
        this.indexOffset = indexOffset;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
