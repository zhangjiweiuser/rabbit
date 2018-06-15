package com.zhang.rabbit.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.zhang.rabbit.dao.RoleDao;
import com.zhang.rabbit.dao.UserDao;
import com.zhang.rabbit.entity.User;
import com.zhang.rabbit.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiwei.zhang
 * @DATE 2017/12/18 0018
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private SqlSessionFactoryBean masterSqlSessionFactoryBean;

    public String getUserNameById(int id) {
        User user = userDao.queryUserById(id);
        logger.info("user:{}", user.toString());
        return user.getName();
    }

    @Override
    public User getUserById(int id) {
        return userDao.queryUserById(id);
    }

    @Override
    public int update(String name) {
        int num = userDao.insertUser(name, (int) (Math.random() * 30));

        return num;
    }

    @Override
    public Map<Integer, String> queryMapById(@Param("id") int id) throws Exception {

        return new HashMap<>();
    }
}
