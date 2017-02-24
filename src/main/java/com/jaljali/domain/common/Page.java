package com.jaljali.domain.common;

import java.io.Serializable;

/**
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 7799223392744138235L;


    /** LIMIT X, Y
     * X 의 기본 값은 0 부터 시작
     * Y 는 불러올 Row 의 개수
    */

    /** DB Row 시작 번호 */
    private Long startNum;

    /** DB Row 끝 번호 */
    private Long endNum;

    /** 현재 페이지 번호 */
    private Long pageNum;

    /** 5개씩 호출 */
    private int count;

}
