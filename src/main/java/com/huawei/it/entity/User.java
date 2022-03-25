package com.huawei.it.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author 帅
 * @Date 2022/3/24 16:42
 * @Description TODO
 **/
@Data
public class User {
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别 0=女 1=男
     */
    private Byte sex;

    /**
     * 删除标志，默认0不删除，1删除
     */
    private Byte deleted;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    public User(Integer id,String username){
        this.id = id;
        this.username = username;
    }
}
