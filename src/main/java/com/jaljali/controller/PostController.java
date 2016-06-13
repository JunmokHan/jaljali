package com.jaljali.controller;

import com.jaljali.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 */
@Controller
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    private PostService postService;


}
