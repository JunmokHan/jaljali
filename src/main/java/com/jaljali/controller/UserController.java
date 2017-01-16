package com.jaljali.controller;

import com.jaljali.domain.common.Handler;
import com.jaljali.domain.User;
import com.jaljali.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 사용자 Controller
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String create(){
        // TODO : 페이지 전송
//        if (StringUtils.isEmpty(user.getEmail())){
//        }
//        if (StringUtils.isEmpty(user.getPassword())){
//rR
//        }
//        if (StringUtils.isEmpty(user.getName())){
//
//        }
//        User user = new User();
//        user.setEmail("email");
//        user.setName("name");
//        user.setPassword("fdsa");
//        user.setPhone("12345");
//        user.setHandler(new Handler(1L));
//        userService.create(user);

        return "/user/create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@RequestParam(value = "email") String email,
                         @RequestParam(value = "password") String password,
                         @RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "phone") String phone){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        if(name.equals(null)){
            user.setName(name);
        }
        user.setPhone(phone);
        userService.create(user);

        return "회원가입 성공";
    }
    public String update(User user){
        return "";
    }



}
