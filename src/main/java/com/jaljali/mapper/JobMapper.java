package com.jaljali.mapper;

import com.jaljali.annotation.Mapper;
import com.jaljali.domain.Job;

import java.util.List;

/**
 * 구인구직 JobMapper
 */
@Mapper
public interface JobMapper {


    /**
     * 게시글 전체 조회
     */
    List<Job> reads();

    /**
     * 게시글 조회
     * @param id
     * @return
     */
    Job read(Long id);

    /**
     * 구인구직 게시글 생성
     * @param job
     */
    void create(Job job);

    /**
     * 게시글 수정
     * @param job
     */
    void update(Job job);

    /**
     * 게시글 삭제
     * @param id
     */
    void delete(Long id);

}
