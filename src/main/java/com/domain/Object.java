package com.domain;

import com.domain.service.Implements;
import com.utils.GenerateUtil;

import java.util.Date;
import java.util.UUID;

public class Object implements Implements {
    private Long id;
    private String name;
    private String ident;
    private Date createDate;
    private UUID uuid;

    public Object() {
        this.id = generate.generateId();
        this.name = String.join("_", "№", this.id.toString());
        this.ident = String.join("_", "№", this.id.toString());
        this.createDate = new Date();
        this.uuid = UUID.randomUUID();
    }

    public Object(String name) {
        this.id = generate.generateId();
        this.name = name;
        this.ident = String.join("_", this.id.toString(), name);
        this.createDate = new Date();
        this.uuid = UUID.randomUUID();
    }

    public Object(String name, String ident) {
        this.id = generate.generateId();
        this.name = name;
        this.ident = ident;
        this.createDate = new Date();
        this.uuid = UUID.randomUUID();
    }

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

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private void Logger(Class<Object> object) {
        GenerateUtil.print(object);
    }
}
