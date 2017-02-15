package com.jaljali.domain;

import com.jaljali.domain.common.Handler;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by music on 2017. 2. 5..
 */
public class House implements Serializable {

    private static final long serialVersionUID = -5406466286833239435L;

    /* 렌트 */
    public static final String RENT = "RENT";
    /* 쉐어하우스 */
    public static final String SHARE = "SHARE";


    private Long id;
    /** 집 종류 */
    private String type;
    /** 글 제목 */
    private String title;
    /** 주소(구글맵 기준) */
    private String address;
    /** 일주일 방세 */
    private BigDecimal price;
    /** 인실 */
    private int people;
    /** 글 내용 */
    private String content;
    /** 삭제 여부 */
    private boolean deleted;
    /** 작성 정보 */
    private Handler handler;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
