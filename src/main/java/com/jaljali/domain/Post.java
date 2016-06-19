package com.jaljali.domain;

import com.jaljali.domain.common.Handler;

import java.io.Serializable;

/**
 * 게시물 post
 */
public class Post implements Serializable{

    private static final long serialVersionUID = -1018724091579304015L;

    private Long id;

    private String title;

    private String content;

    private Handler handler;

    private boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
