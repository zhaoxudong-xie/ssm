package com.zhao.controller;

import com.zhao.domain.Admin;
import com.zhao.service.IAdminService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@Controller
@RequestMapping("/admin")
@SessionAttributes({"admin","error_msg"})
public class AdminController {
    @Autowired
    private IAdminService adminService;

    /**
     * 登录管理
     * @param response
     * @param request
     */
    @RequestMapping("login")
    public void login(Model model,HttpServletResponse response, HttpServletRequest request) throws InvocationTargetException, IllegalAccessException, IOException, ServletException {
        Map adminMap = request.getParameterMap();
        Admin admin=new Admin();
        BeanUtils.populate(admin,adminMap);
        boolean flag=adminService.login(admin);
        if(flag==true){
            model.addAttribute("admin",admin.getAdminName());
            response.sendRedirect(request.getContextPath()+"/user/userList");
        }else{
            response.sendRedirect("/login.jsp");
            model.addAttribute("error_msg","您输入的用户名或密码错误！");
        }
    }
}
