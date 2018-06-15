package com.zhang.rabbit.controller;

import com.zhang.rabbit.entity.Role;
import com.zhang.rabbit.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangjiwei on 2018/4/1.
 */
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/getRoleById",method = RequestMethod.POST)
    public Role getRoleById(int id){
        return roleService.getRoleById(id);
    }

    @RequestMapping(value = "/insertRoleById")
    public int insertRoleById(Role role){
        return roleService.insertRole(role);
    }
}
