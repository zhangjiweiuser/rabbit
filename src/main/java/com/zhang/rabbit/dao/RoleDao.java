package com.zhang.rabbit.dao;

import com.zhang.rabbit.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangjiwei on 2018/4/1.
 */
@Repository
public interface RoleDao {

    Role getRoleById(@Param("id") int id);

    int insertRole(@Param("role") Role role);
}
