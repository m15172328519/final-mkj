package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/8/28.
 */
@Controller
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String queryAll(HttpSession session) {
        List<User> users = userService.queryAll();
        session.setAttribute("users", users);
        return "index";
    }

    @RequestMapping("/save")
    public void save(User user) {
        userService.save(user);
    }

}
