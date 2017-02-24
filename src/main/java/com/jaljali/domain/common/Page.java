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
    private int startNum = 0;

    /** DB Row 끝 번호 */
    private int endNum;

    /** 현재 페이지 번호 */
    private int pageNum = 1;

    /** 5개씩 호출 */
    private int count = 5;



    public int getStartNum() {
        return startNum;
    }

    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }

    public int getEndNum() {
        return endNum;
    }

    public void setEndNum(int endNum) {
        this.endNum = endNum;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
