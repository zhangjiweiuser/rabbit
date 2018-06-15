package com.zhang.rabbit.service;

import java.util.Map;

import com.zhang.rabbit.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiwei.zhang
 * @DATE 2017/12/18 0018
 */
public interface UserService {

    String getUserNameById(int id);

    User getUserById(int id);

    int update(String name);

    Map<Integer, String> queryMapById(@Param("id") int id) throws Exception;
}
