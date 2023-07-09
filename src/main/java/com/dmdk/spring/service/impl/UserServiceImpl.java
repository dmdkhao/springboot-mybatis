package com.dmdk.spring.service.impl;

import com.dmdk.spring.entity.User;
import com.dmdk.spring.mapper.UserMapper;
import com.dmdk.spring.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<User> saveAndList(User user) {
        int i = userMapper.insertUser(user);
        List<User> list = userMapper.list();
        return list;
    }
}
