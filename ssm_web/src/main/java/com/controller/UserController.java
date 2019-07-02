package com.controller;

import com.bean.UserInfo;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/login.do")
    public ModelAndView logIn(UserInfo userInfo){
        ModelAndView mv = new ModelAndView();
        boolean flag = iUserService.doLogIn(userInfo);
        if(flag){
            mv.setViewName("main");
        }
        else{
            mv.setViewName("../failer");
        }
        return mv;
    }
}
