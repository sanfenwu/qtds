package com.otherds.xxzy.controller;

import com.otherds.xxzy.entity.User;
import com.otherds.xxzy.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl impl;
    @RequestMapping("/qtds")
    public String view(HttpServletRequest request){
        return "/hua/guo";
    }
    @RequestMapping("/qujingshizhe")
    @ResponseBody
    public List<User> go(HttpServletRequest request){
        return impl.queryAll1();
    }
    @RequestMapping("/dzsf")
    @ResponseBody
    public List<User> go2(HttpServletRequest request){
        return impl.queryAll2();
    }
}
