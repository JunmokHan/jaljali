package com.jaljali.service;

import com.jaljali.domain.Job;

import java.util.List;

public interface JobService {

    /**
     * 구인구직 게시글 전체 조회
     */
    List<Job> reads();

    /**
     * 구인구직 게시글 조회
     * @param id
     * @return
     */
    Job read(Long id);

    /**
     * 구인구직 게시글 생성
     * @param job
     */
    Long create(Job job);

    /**
     * 구인구직 게시글 수정
     * @param job
     */
    void update(Job job);

    /**
     * 구인구직 게시글 삭제
     * @param id
     */
    void delete(Long id);



}
