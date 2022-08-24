package com.rask.f1api.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "circuits")
public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer circuitId;
    private String circuitRef;
    private String name;
    private String location;
    private String country;
    private Double lat;
    private Double lgn;
    private Integer alt;
    private String url;

    public Circuit(){}

    public Circuit(Integer circuitId, String circuitRef, String name, String location, String country, Double lat, Double lgn, Integer alt, String url) {
        this.circuitId = circuitId;
        this.circuitRef = circuitRef;
        this.name = name;
        this.location = location;
        this.country = country;
        this.lat = lat;
        this.lgn = lgn;
        this.alt = alt;
        this.url = url;
    }

    public Integer getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(Integer circuitId) {
        this.circuitId = circuitId;
    }

    public String getCircuitRef() {
        return circuitRef;
    }

    public void setCircuitRef(String circuitRef) {
        this.circuitRef = circuitRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLgn() {
        return lgn;
    }

    public void setLgn(Double lgn) {
        this.lgn = lgn;
    }

    public Integer getAlt() {
        return alt;
    }

    public void setAlt(Integer alt) {
        this.alt = alt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
