package com.jaljali.controller;

import com.jaljali.domain.Job;
import com.jaljali.domain.common.Handler;
import com.jaljali.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView reads(){

        List<Job> jobs = jobService.reads();

        ModelAndView mav = new ModelAndView();
        mav.addObject("jobs", jobs);
        mav.addObject("page", "job/list");
        mav.setViewName("index");

        return mav;
    }

    public ModelAndView read(
            @PathVariable("id") Long id
    ){
        Job job = jobService.read(id);
        if(job == null) job = new Job();

        ModelAndView mav = new ModelAndView();
        mav.addObject("job", job);
        mav.addObject("page", "job/show");
        mav.setViewName("index");

        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create(){

        ModelAndView mav = new ModelAndView();
        mav.addObject("page", "job/new");
        mav.setViewName("index");

        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Job job) throws Exception {
        // FIXME : 로그인 유저 ID 로 변경할 것
        Handler handler = new Handler(1L);
        job.setHandler(handler);

        Long id = jobService.create(job);
        if(id == null) throw new Exception();
        return "redirect:/job";
    }

}
