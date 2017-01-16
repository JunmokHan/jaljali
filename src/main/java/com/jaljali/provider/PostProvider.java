package com.jaljali.provider;

import com.jaljali.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by music on 2016. 6. 12..
 */
public interface PostProvider {

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
