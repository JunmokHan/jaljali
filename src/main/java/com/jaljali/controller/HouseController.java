package com.jaljali.controller;

import com.jaljali.domain.House;
import com.jaljali.domain.common.Handler;
import com.jaljali.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "/{id}")
    public ModelAndView read(
            @PathVariable("id") Long id
    ){
        House house = houseService.read(id);
        if(house == null) house = new House();

        ModelAndView mav = new ModelAndView();
        mav.addObject("house", house);
        mav.addObject("page", "house/show");
        mav.setViewName("index");

        return mav;
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create(){

        ModelAndView mav = new ModelAndView();
        mav.addObject("page", "house/new");
        mav.setViewName("index");

        return mav;
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(
            House house
    ) throws Exception {
        // FIXME : 로그인 유저 ID 로 변경할 것
        Handler handler = new Handler(1L);
        house.setHandler(handler);

        Long id = houseService.create(house);
        if(id == null) throw new Exception();
        return "redirect:/house";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView update(
            @PathVariable("id") Long id
    ) throws Exception {
        // TODO : 요청자 작성자 비교

        House house = houseService.read(id);
        if(house == null) throw new Exception();

        ModelAndView mav = new ModelAndView();

        mav.addObject("house", house);
        mav.addObject("page", "house/edit");
        mav.setViewName("index");

        return mav;
    }
}
