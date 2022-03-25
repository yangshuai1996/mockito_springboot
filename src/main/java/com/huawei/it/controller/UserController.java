package com.huawei.it.controller;

import com.huawei.it.annotation.TargetDataSource;
import com.huawei.it.entity.User;
import com.huawei.it.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 帅
 * @Date 2022/3/24 17:02
 * @Description TODO
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/add/user")
    public String addUser(){
        User user = new User(11,"TOM");
        userService.insertUser(user);
        return "SUCCESS";
    }
}
