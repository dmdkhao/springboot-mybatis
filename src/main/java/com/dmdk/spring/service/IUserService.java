package com.dmdk.spring.service;

import com.dmdk.spring.entity.User;

import java.util.List;

public interface IUserService {
    List<User> list();

    int insertUser(User user);

    List<User> saveAndList(User user);
}
