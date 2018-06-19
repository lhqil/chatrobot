package com.chatRobot.controller;



import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(Long id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser22(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }
    @RequestMapping("/insertUser.do")
    public void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int userId = Integer.parseInt(request.getParameter("id"));
        String s=request.getParameter("email").toString();
        String password=request.getParameter("password").toString();
        String username=request.getParameter("username").toString();
        String role=request.getParameter("role").toString();
        int status=Integer.parseInt( request.getParameter("status"));
        String ip=request.getParameter("regIp").toString();

        User user=new User();
        user.setId(userId);
        user.setEmail(s);
        user.setPassword(password);
        user.setUsername(username);
        user.setRole(role);
        user.setRegIp(ip);

        user.setStatus(status);

        this.userService.insertUser22(user);
        ObjectMapper mapper = new ObjectMapper();

     /*   response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();*/
    }
}