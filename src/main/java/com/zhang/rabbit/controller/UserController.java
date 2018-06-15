package com.zhang.rabbit.controller;

import java.util.Arrays;
import java.util.List;

import com.zhang.rabbit.entity.User;
import com.zhang.rabbit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiwei.zhang
 * @DATE 2017/12/18 0018
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/testFreemarker")
    public ModelAndView testFreemarker(@RequestParam(value = "a", required = false) String a) {
        ModelAndView mv = new ModelAndView();
        User user = new User(1, "zhangsan", 10);
        List<String> list = Arrays.asList("jack1", "jack2", "jack3");

        mv.addObject("list", list);
        mv.addObject("user", user);
        mv.addObject("param", "a");
        mv.setViewName("my");
        return mv;
    }

    @RequestMapping(path = "/getUserNameById")
    public String getUserNameById(int id) {
        return userService.getUserNameById(id);
    }

    @RequestMapping(path = "/updateUser")
    public User getUserNameById(User user) {
        return user;
    }

    @RequestMapping(path = "/getUserById")
    public User getUserById(int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(path = "/getUserByName")
    public User getUserByName(String name) {
        return new User(6, name, 19);
    }

    @RequestMapping(path = "/update")
    public int update(String name) {
        return userService.update(name);
    }
}
