package com.jaljali.controller;

import com.jaljali.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RootController {

	@Autowired
	JobService jobService;

	@RequestMapping(method = RequestMethod.GET)
	public String main() {
		return "redirect:/house";
	}
}