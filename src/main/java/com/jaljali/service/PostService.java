package com.jaljali.service;

import com.jaljali.domain.Post;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    /**
     * 게시글 전체 조회
     */
    List<Post> reads();

    /**
     * 게시글 조회
     * @param id
     * @return
     */
    Post read(Long id);

    /**
     * 게시글 생성
     * @param post
     */
    void create(Post post);

    /**
     * 게시글 수정
     * @param post
     */
    void update(Post post);

    /**
     * 게시글 삭제
     * @param id
     */
    void delete(Long id);



}
