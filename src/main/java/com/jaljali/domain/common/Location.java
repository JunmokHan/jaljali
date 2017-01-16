package com.jaljali.domain.common;

import java.io.Serializable;

/**
 * 지역 location
 */
public class Location implements Serializable {

    private Long id;

    private String state;

    private String name;

    private Handler handler;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
