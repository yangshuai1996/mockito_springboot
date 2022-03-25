package com.huawei.it;

import com.huawei.it.entity.User;
import com.huawei.it.mapper.UserMapper;
import com.huawei.it.service.IUserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class MockitoSpringbootApplicationTests {

    @Autowired
    private IUserService userService;

    @MockBean
    private UserMapper userMapper;
    @Test
    public void getUserById() {
        //普通的使用userService，他里面会再去调用userDao取得数据库的数据
        User user = userService.getUserById(6);

        //检查结果
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), new Integer(6));
        Assert.assertEquals(user.getUsername(), "string");
    }

   @Test
    public void getUserById1() {
        //定义当调用mock userMapper的getUserById()方法，并且参数为3时，就返回id为200、name为I'm mock3的user对象
        //Mockito.when(userMapper.getUserById(3)).thenReturn(new User(3,"Tom"));
        Mockito.when(userMapper.getUserById(Mockito.anyInt())).thenReturn(new User(3,"Tom"));
        User user = userService.getUserById(3);

        //检查结果
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), new Integer(3));
        Assert.assertEquals(user.getUsername(), "Tom");
    }

    @Test
    public void testInsert(){
        Mockito.when(userMapper.insertUser(Mockito.any(User.class))).thenReturn(100);
        Integer i = userService.insertUser(new User(3,"Tom")); //会返回100
        Assert.assertEquals(100,i.intValue());
    }

    @Test
    public void testGetById(){
        Mockito.when(userService.getUserById(9)).thenThrow(new RuntimeException("mock throw exception"));
        User user = userService.getUserById(9); //会抛出一个RuntimeException
    }
}
