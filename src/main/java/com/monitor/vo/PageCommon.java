package com.monitor.vo;

public class PageCommon {
    public static final int PAGE_DEFAULT_SIZE=15;
    /**
     * 每页显示的数量
     */
    private int pageSize;
    /**
     * 当前页
     */
    private int pageNo;
    /**
     * 总页数
     */
    private int pageTotal;
    /**
     * 总记录数
     */
    private int total;

    public int getPageSize() {
        return PAGE_DEFAULT_SIZE;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
