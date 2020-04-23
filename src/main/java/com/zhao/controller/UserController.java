package com.zhao.controller;

import com.zhao.domain.User;
import com.zhao.service.IUserService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 查询所有的list列表
     * @return
     */
    @RequestMapping("/userList")
    public String userList(Model model){
        List<User> list=userService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/addUser")
    public void addUser(HttpServletRequest request, HttpServletResponse response) throws IOException, InvocationTargetException, IllegalAccessException {
        Map map = request.getParameterMap();
        User user=new User();
        BeanUtils.populate(user,map);
        userService.addUser(user);
        response.sendRedirect(request.getContextPath()+"/user/userList");
    }
}
