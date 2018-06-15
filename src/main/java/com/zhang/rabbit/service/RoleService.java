package com.zhang.rabbit.service;

import com.zhang.rabbit.entity.Role;

/**
 * Created by zhangjiwei on 2018/4/1.
 */
public interface RoleService {
    Role getRoleById(int id);

    int insertRole(Role role);
}
