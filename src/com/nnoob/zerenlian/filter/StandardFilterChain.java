package com.nnoob.zerenlian.filter;

import java.util.LinkedList;
import java.util.List;

/**
 * @CreateTime: 2022/3/9 5:59 下午
 * @Author: nnoobnie
 * @Description: StandardFilterChain
 */
public class StandardFilterChain implements FilterChain {


    private int cur;

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public StandardFilterChain() {
        this.cur = 0;
    }

    private List<Filter> filters = new LinkedList<>();

    @Override
    public void doFilter(Object o) {
        if (filters.size()>cur)
        filters.get(cur++).doFilter(o, this);
    }



    protected void doFilterInterval(){

    }
}
