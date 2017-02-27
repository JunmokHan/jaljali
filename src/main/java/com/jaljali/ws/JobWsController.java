package com.jaljali.ws;

import com.jaljali.domain.Job;
import com.jaljali.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/ws/job")
public class JobWsController {
    @Autowired
    private JobService jobService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ModelAndView reads(
            @RequestParam("index") int index
    ){
        List<Job> jobs = jobService.reads(index);

        ModelAndView mav = new ModelAndView();
        mav.addObject("jobs", jobs);
        return mav;
    }
}
