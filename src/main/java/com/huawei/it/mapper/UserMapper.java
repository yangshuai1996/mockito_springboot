package com.huawei.it.mapper;

import com.huawei.it.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 帅
 * @Date 2022/3/24 16:44
 * @Description dao 层
 **/
@Mapper
public interface UserMapper {
    User getUserById(Integer id);

    Integer insertUser(User user);
}
