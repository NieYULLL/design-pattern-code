package com.nnoob.zerenlian.filter;

/**
 * @CreateTime: 2022/3/9 5:53 下午
 * @Author: nnoobnie
 * @Description: AFilter
 */
public class AFilter implements Filter{
    @Override
    public void doFilter(Object o, FilterChain filterChain) {

        System.err.println("A");

        filterChain.doFilter(o);
        System.err.println("A");
    }
}
