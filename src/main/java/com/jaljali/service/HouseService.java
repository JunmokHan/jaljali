package com.jaljali.service;

import com.jaljali.domain.House;

import java.util.List;

public interface HouseService {

    /**
     * 집 게시글 전체 조회
     */
    List<House> reads();

    /**
     * 집 게시글 조회
     * @param id
     * @return
     */
    House read(Long id);

    /**
     * 집 게시글 생성
     * @param house
     */
    void create(House house);

    /**
     * 집 게시글 수정
     * @param house
     */
    void update(House house);

    /**
     * 집 게시글 삭제
     * @param id
     */
    void delete(Long id);



}
