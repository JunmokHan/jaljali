package com.jaljali.domain;

import java.io.Serializable;

/**
 * Created by music on 2016. 6. 10..
 */
public class User implements Serializable{

    private static final long serialVersionUID = -649872680489644419L;

    private Long id;

    private String email;

    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
