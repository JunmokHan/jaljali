package com.jaljali.mapper;

import com.jaljali.annotation.Mapper;
import com.jaljali.domain.House;

import java.util.List;

/**
 * 집 houseMapper
 */
@Mapper
public interface HouseMapper {


    /**
     * 게시글 전체 조회
     */
    List<House> reads();

    /**
     * 게시글 조회
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
