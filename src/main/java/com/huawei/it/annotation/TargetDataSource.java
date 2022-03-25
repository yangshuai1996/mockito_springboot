package com.huawei.it.annotation;

import java.lang.annotation.*;

/**
 * @Author 帅
 * @Date 2022/3/25 11:44
 * @Description TODO
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public  @interface TargetDataSource {
    String name();
}
