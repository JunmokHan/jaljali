package com.jaljali.service.impl;

import com.jaljali.domain.Post;
import com.jaljali.provider.PostProvider;
import com.jaljali.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostProvider postProvider;


    @Override
    public List<Post> reads() {
        return postProvider.reads();
    }

    @Override
    public Post read(Long id) {
        return postProvider.read(id);
    }

    @Override
    public void create(Post post) {
        postProvider.create(post);
    }

    @Override
    public void update(Post post) {
        postProvider.update(post);
    }

    @Override
    public void delete(Long id) {
        postProvider.delete(id);
    }

}
