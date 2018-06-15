package com.zhang.rabbit.controller;

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
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/toLogin")
    public ModelAndView toLogin(@RequestParam(value = "a", required = false) String a) {
        return new ModelAndView("login");
    }

    @RequestMapping(path = "/login")
    public ModelAndView testFreemarker(@RequestParam(value = "epyId") Integer epyId,
                                       String userName, String password) {
        return new ModelAndView("login");
    }
}
