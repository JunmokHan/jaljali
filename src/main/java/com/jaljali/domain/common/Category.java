package com.jaljali.domain.common;

import java.io.Serializable;

/**
 * Created by music on 2016. 6. 15..
 */
public class Category implements Serializable {

    private static final long serialVersionUID = 7160425300330838845L;

    private Long id;

    private String name;

    private Handler handler;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
