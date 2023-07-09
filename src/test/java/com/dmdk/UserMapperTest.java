package com.dmdk;

import com.dmdk.spring.Application;
import com.dmdk.spring.entity.User;
import com.dmdk.spring.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest(classes = Application.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void insert() {
        User user = new User();
        user.setUserName("zhangsan");
        user.setPassword("123456");
        user.setPhid(1L);
        int i = userMapper.insertUser(user);
        log.info("i={}", i);
    }

    @Test
    void list() {
        List<User> list = userMapper.list();
        log.info("list={}", list);
    }
}
