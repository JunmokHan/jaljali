package com.jaljali.controller;

import com.jaljali.domain.Job;
import com.jaljali.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class RootController {
	@Autowired
	JobService jobService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView readPosts() {
		List<Job> jobs = jobService.reads();

		ModelAndView mav = new ModelAndView();
		mav.addObject("jobs", jobs);
		mav.setViewName("index");
		return mav;
	}
}