package com.nnoob.zerenlian.filter;

/**
 * @CreateTime: 2022/3/9 5:54 下午
 * @Author: nnoobnie
 * @Description: BFilter
 */
public class BFilter implements Filter{
    @Override
    public void doFilter(Object o, FilterChain filterChain) {
        System.err.println("B");
        filterChain.doFilter(o);
        System.err.println("B");
    }
}
