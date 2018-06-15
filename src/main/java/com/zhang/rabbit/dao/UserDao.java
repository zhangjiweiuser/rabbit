package com.zhang.rabbit.dao;

import java.util.List;
import java.util.Map;

import com.zhang.rabbit.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jiwei.zhang
 * @DATE 2017/12/18 0018
 */
@Repository
public interface UserDao {

    User queryUserById(@Param("id") int id);

    int insertUser(@Param("name") String name, @Param("age") int age);

    Map<String,Object> queryUserMapById(@Param("id") int id);

    @MapKey("name")
    Map<String,User> queryUserMapWithKeyById(@Param("id") int id);

    List<User> queryUserByIds(@Param("ids") List<Integer> ids);

    List<User> queryUserByName(@Param("name") String name);

    Map<Integer,String> queryMapById(@Param("id") int id);
}
