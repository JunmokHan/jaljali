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
    /** 시급 */
    private BigDecimal wage;
    /** 근무 시간 */
    private String workingTime;
    /** 근무 시작 일 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
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

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
