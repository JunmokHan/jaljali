package com.jaljali.controller;

import com.jaljali.domain.House;
import com.jaljali.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView reads(){

        List<House> houses = houseService.reads();

        ModelAndView mav = new ModelAndView();
        mav.addObject("houses", houses);
        mav.addObject("page", "house/list");
        mav.setViewName("index");

        return mav;
    }
}
