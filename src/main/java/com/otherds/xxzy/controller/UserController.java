package com.otherds.xxzy.controller;

import com.otherds.xxzy.base.controller.BaseController;
import com.otherds.xxzy.base.utils.StateParameter;
import com.otherds.xxzy.entity.User;
import com.otherds.xxzy.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController extends BaseController {
    @Autowired
    UserServiceImpl impl;
    @RequestMapping("/qtds")
    public String view(HttpServletRequest request){
        return "/hua/guo";
    }
    @RequestMapping("/qujingshizhe")
    @ResponseBody
    public ModelMap go(HttpServletRequest request){
        return getModelMap(StateParameter.SUCCESS,impl.queryAll1(),"请求成功！");
    }
    @RequestMapping("/dzsf")
    @ResponseBody
    public ModelMap go2(HttpServletRequest request){
        return getModelMap(StateParameter.SUCCESS,impl.queryAll2(),"请求成功！");
    }
}
