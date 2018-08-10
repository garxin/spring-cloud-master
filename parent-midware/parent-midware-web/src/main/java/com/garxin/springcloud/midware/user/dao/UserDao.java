package com.garxin.springcloud.midware.user.dao;



import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.garxin.springcloud.midware.user.domain.User;

public interface UserDao {

    int insert(User record);

    List<User> selectUsers();
}