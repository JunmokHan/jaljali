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

    private String name;

    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
