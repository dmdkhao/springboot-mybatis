package com.dmdk.spring.controller;

import com.dmdk.spring.entity.User;
import com.dmdk.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private List<User> list () {
       return userService.list();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    private int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }


    @RequestMapping(value = "/saveAndList", method = RequestMethod.POST)
    private List<User> saveAndList(@RequestBody User user) {
        List<User> users = userService.saveAndList(user);
        return users;
    }
}
