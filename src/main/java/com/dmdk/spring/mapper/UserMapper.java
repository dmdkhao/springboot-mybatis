package com.dmdk.spring.mapper;

import com.dmdk.spring.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int insertUser(User user);

    User getUserByNameAndPassword(User user);

    List<User> list();
}
