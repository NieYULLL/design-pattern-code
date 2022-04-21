package com.nnoob.zerenlian.filter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @CreateTime: 2022/3/9 5:54 下午
 * @Author: nnoobnie
 * @Description: Client
 */
public class Client {

    public static void main(String[] args) {


        StandardFilterChain standardFilterChain = new StandardFilterChain();
        List<Filter> filters = new ArrayList<>();

        filters.add(new AFilter());
        filters.add(new BFilter());
        standardFilterChain.setFilters(filters);

        standardFilterChain.doFilter(new Object());

    }
}
