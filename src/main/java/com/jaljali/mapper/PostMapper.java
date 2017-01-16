package com.jaljali.mapper;

import com.jaljali.annotation.Mapper;
import com.jaljali.domain.Post;
import com.jaljali.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 게시글 postMapper
 */
@Mapper
public interface PostMapper {


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
