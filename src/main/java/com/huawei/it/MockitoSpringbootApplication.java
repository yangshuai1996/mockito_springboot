package com.huawei.it;

import com.huawei.it.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.huawei.it.mapper")
@Import(DynamicDataSourceRegister.class)
public class MockitoSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockitoSpringbootApplication.class, args);
    }

}
