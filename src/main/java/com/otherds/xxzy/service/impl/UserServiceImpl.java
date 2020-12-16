package com.otherds.xxzy.service.impl;

import com.otherds.xxzy.entity.User;
import com.otherds.xxzy.mapper.db1.UserMapper1;
import com.otherds.xxzy.mapper.db2.UserMapper2;
import com.otherds.xxzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper1 um1;
    @Autowired
    UserMapper2 um2;
    @Override
    public List<User> queryAll1() {
        return um1.selectAll();
    }

    @Override
    public List<User> queryAll2() {
        return um2.selectAll();
    }
}
