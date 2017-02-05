package com.jaljali.provider;

import com.jaljali.domain.House;

import java.util.List;

/**
 * Created by music on 2016. 6. 12..
 */
public interface HouseProvider {

    /**
     * 집 게시물 전체 조회
     */
    List<House> reads();

    /**
     * 집 게시물 조회
     * @param id
     * @return
     */
    House read(Long id);

    /**
     * 집 게시물 생성
     * @param house
     */
    void create(House house);

    /**
     * 집 게시물 수정
     * @param house
     */
    void update(House house);

    /**
     * 집 게시물 삭제
     * @param id
     */
    void delete(Long id);

}
