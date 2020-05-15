package com.zhao.controller;

import com.zhao.domain.User;
import com.zhao.service.IUserService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @RequestMapping("/delete")
    public void deleteUser(@RequestParam(name="id",required = true)Integer id, HttpServletResponse response, HttpServletRequest request) throws IOException {
        userService.delete(id);
        response.sendRedirect(request.getContextPath()+"/user/userList");
    }

    @RequestMapping("/find")
    public String findById(@RequestParam(name="sid",required = true)Integer id,Model model){
        User user=userService.findById(id);
        model.addAttribute("user",user);
        model.addAttribute("sid",id);
        return "user";
    }

    @RequestMapping("/update")
    public void update(@RequestParam(name="id",required = true)Integer id,@RequestBody Map<String, Object> reqMap,HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = String.valueOf(reqMap.get("name"));
        String sex = String.valueOf(reqMap.get("sex"));
        Integer age = Integer.valueOf(String.valueOf(reqMap.get("age")));
        Integer stuId = Integer.valueOf(String.valueOf(reqMap.get("stuId")));
        Integer qq = Integer.valueOf(String.valueOf(reqMap.get("qq")));
        String email = String.valueOf(reqMap.get("email"));
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setQq(qq);
        user.setStuId(stuId);
        user.setEmail(email);
        user.setSex(sex);
        userService.update(user);
        response.sendRedirect(request.getContextPath() + "/user/userList");
    }
}
