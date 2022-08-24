package com.rask.f1api.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "constructors")
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer constructorId;
    private String constructorRef;
    private String name;
    private String nationality;
    private String url;

    public Constructor() {
    }

    public Constructor(Integer constructorId, String constructorRef, String name, String nationality, String url) {
        this.constructorId = constructorId;
        this.constructorRef = constructorRef;
        this.name = name;
        this.nationality = nationality;
        this.url = url;
    }

    public Integer getConstructorId() {
        return constructorId;
    }

    public String getConstructorRef() {
        return constructorRef;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getUrl() {
        return url;
    }
}
