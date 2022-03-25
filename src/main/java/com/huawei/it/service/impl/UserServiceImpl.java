package com.huawei.it.service.impl;

import com.huawei.it.annotation.TargetDataSource;
import com.huawei.it.entity.User;
import com.huawei.it.mapper.UserMapper;
import com.huawei.it.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 帅
 * @Date 2022/3/24 16:43
 * @Description service 层
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    @TargetDataSource(name = "ds1")
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    @TargetDataSource(name = "ds2")
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
