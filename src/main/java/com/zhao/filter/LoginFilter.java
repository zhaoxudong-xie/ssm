package com.zhao.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        HttpSession session=request.getSession();
        //获取用户名请求的url
        String path=request.getRequestURI();
        //获取从session中获取的用户名
        String adminName=(String) session.getAttribute("admin");
        //登陆页面wuxuguolv
        if(path.indexOf("/login.jsp")>-1||path.indexOf("/add.jsp")>-1||path.indexOf("/admin/login")>-1
                ||path.indexOf("/user/addUser")>-1||path.endsWith(".js")||path.endsWith(".css")||path.endsWith(".images")){
            filterChain.doFilter(request,response);
            return;
        }
        //判断没有获取到用户名
        if(adminName==null||"".equals(adminName)){
            response.sendRedirect("/login.jsp");
        }else{
            //已经登陆放行
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
