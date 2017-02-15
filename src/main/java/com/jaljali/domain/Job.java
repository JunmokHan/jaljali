package com.jaljali.domain;

import com.jaljali.domain.common.Handler;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 구인구직 게시물
 */
public class Job implements Serializable{

    private static final long serialVersionUID = -1018724091579304015L;

    /* 구인 */
    public static final String EMPLOYER = "EMPLOYER";

    /* 구직 */
    public static final String EMPLOYEE = "EMPLOYEE";


    private Long id;
    /** 게시글 종류(구인구직) */
    private String type;
    /** 글 제목 */
    private String title;
    private BigDecimal wage;
    private String time;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
