package com.huawei.it.service;

import com.huawei.it.entity.User;

/**
 * @Author 帅
 * @Date 2022/3/24 16:43
 * @Description TODO
 **/
public interface IUserService {

    User getUserById(Integer id);

    Integer insertUser(User user);
}
