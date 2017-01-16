package com.jaljali.provider.impl;

import com.jaljali.domain.Post;
import com.jaljali.mapper.PostMapper;
import com.jaljali.provider.PostProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by music on 2017. 1. 16..
 */
@Repository
public class PostProviderImpl implements PostProvider{

    @Autowired
    PostMapper postMapper;

    @Override
    public List<Post> reads() {
        return postMapper.reads();
    }

    @Override
    public Post read(Long id) {
        return postMapper.read(id);
    }

    @Override
    public void create(Post post) {
        postMapper.create(post);
    }

    @Override
    public void update(Post post) {
        postMapper.update(post);
    }

    @Override
    public void delete(Long id) {
        postMapper.delete(id);
    }
}
