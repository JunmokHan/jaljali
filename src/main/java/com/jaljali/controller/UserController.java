package com.jaljali.controller;

import com.jaljali.domain.Handler;
import com.jaljali.domain.User;
import com.jaljali.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 사용자 Controller
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String create(){
//        if (StringUtils.isEmpty(user.getEmail())){
//        }
//        if (StringUtils.isEmpty(user.getPassword())){
//
//        }
//        if (StringUtils.isEmpty(user.getName())){
//
//        }
        User user = new User();
        user.setEmail("email");
        user.setName("name");
        user.setPassword("fdsa");
        user.setPhone("12345");
        user.setHandler(new Handler(1L));
        userService.create(user);

        return "";
    }

    public String update(User user){
        return "";
    }



}
