package com.jaljali.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 생성, 수정 관련 정보
 */
public class Handler implements Serializable{

    private static final long serialVersionUID = -7653625879763892942L;

    /** 생성자 */
   private Long creator;

    /** 생성일 */
    private Date created;

    /** 수정자 */
    private Long modifier;

    /** 수정일 */
    private Date modified;

    public Handler(Long id) {
        this.creator = id;
        this.created = new Date();
        this.modifier = id;
        this.modified = new Date();
    }

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
