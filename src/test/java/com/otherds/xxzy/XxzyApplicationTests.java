package com.otherds.xxzy;

import com.otherds.xxzy.entity.User;
import com.otherds.xxzy.service.UserService;
import com.otherds.xxzy.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class XxzyApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    UserServiceImpl service;
    @Test
    public void dsTest(){
        List<User> users = service.queryAll1();
        List<User> users1 = service.queryAll2();
        for (User u1:users
             ) {
            System.out.println(u1.toString());
        }
        for (User u2:users1
             ) {
            System.out.println(u2.toString());
        }
    }

}
