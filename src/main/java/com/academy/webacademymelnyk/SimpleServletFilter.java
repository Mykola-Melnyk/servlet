package com.academy.webacademymelnyk;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public class SimpleServletFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("1. SimpleServletFilter.doFilter");
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
