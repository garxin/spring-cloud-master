package com.garxin.springcloud.midware.user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.garxin.springcloud.midware.user.domain.User;

@Component
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByUsernameContaining(String username);

    User getByUsernameIsAndPasswordIs(String username,String password);

    User getByUsernameIs(String username);
}