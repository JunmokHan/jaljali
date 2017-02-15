package com.jaljali.provider;

import com.jaljali.domain.Job;

import java.util.List;

/**
 * Created by music on 2016. 6. 12..
 */
public interface JobProvider {

    /**
     * 구인구직 전체 조회
     */
    List<Job> reads();

    /**
     * 구인구직 조회
     * @param id
     * @return
     */
    Job read(Long id);

    /**
     * 구인구직 생성
     * @param job
     */
    Long create(Job job);

    /**
     * 구인구직 수정
     * @param job
     */
    void update(Job job);

    /**
     * 구인구직 삭제
     * @param id
     */
    void delete(Long id);

}
