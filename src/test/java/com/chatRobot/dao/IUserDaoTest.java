package com.chatRobot.dao;

import com.chatRobot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.text.SimpleDateFormat;
import java.util.Date;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 2;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }
    @Test
    public  void  insertuser() throws  Exception {
        User user = new User();
        int iid = 4;
        String s = "33";
        String password = "33";
        String username = "33";
        String role = "33";
        int status = 0;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        date = sdf.parse("2008-08-08 12:10:12");
        String ip = "101.0.0.1";
        user.setId(iid);
        user.setEmail(s);
        user.setPassword(password);
        user.setUsername(username);
        user.setRole(role);
        user.setRegIp(ip);
        user.setRegTime(date);
        user.setStatus(status);
        int n = dao.insertUser(user);

        System.out.println("success");
    }



}