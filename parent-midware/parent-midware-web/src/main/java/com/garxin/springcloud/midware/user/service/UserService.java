package com.garxin.springcloud.midware.user.service;

import com.garxin.springcloud.midware.user.domain.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}