package com.domain;

import com.domain.service.Generation;
import com.utils.Separator;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class Object implements Generation {
    private Long id;
    private String name;
    private String ident;
    private Date createDate;
    private UUID uuid;

    public Object() {
        this.id = generate.generateId();
        this.name = String.join(Separator.UNDERSCORE.getTitle(), "№", this.id.toString());
        this.ident = String.join(Separator.UNDERSCORE.getTitle(), "№", this.id.toString());
        this.createDate = new Date();
        this.uuid = UUID.randomUUID();
    }

    public Object(String name) {
        this.id = generate.generateId();
        this.name = name;
        this.ident = String.join(Separator.UNDERSCORE.getTitle(), this.id.toString(), name);
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
}
