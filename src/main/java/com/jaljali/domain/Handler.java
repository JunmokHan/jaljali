package com.jaljali.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by music on 2016. 6. 12..
 */
public class Handler implements Serializable{

    private static final long serialVersionUID = -7653625879763892942L;

    private Long creator;

    private Date created;

    private Long modifier;

    private Date modified;

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
