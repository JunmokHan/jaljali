package com.jaljali.controller;

import com.jaljali.domain.Post;
import com.jaljali.service.PostService;
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
	PostService postService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView readPosts() {
		List<Post> posts = postService.reads();

		ModelAndView mav = new ModelAndView();
		mav.addObject("posts", posts);
		mav.setViewName("index");
		return mav;
	}
}