package com.nnoob.zerenlian.filter;

/**
 * @CreateTime: 2022/3/9 5:53 下午
 * @Author: nnoobnie
 * @Description: Filter
 */
public interface Filter {

    void doFilter(Object o,FilterChain filterChain);


}
