package com.jaljali.domain;

import com.jaljali.domain.common.Handler;

import java.io.Serializable;

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

    private String type;

    private String title;

    private String content;

    private boolean deleted;

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
