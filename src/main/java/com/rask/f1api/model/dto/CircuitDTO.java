package com.rask.f1api.model.dto;

public class CircuitDTO {
    private String name;
    private String location;
    private String country;
    private String url;

    public CircuitDTO(String name, String location, String country, String url) {
        this.name = name;
        this.location = location;
        this.country = country;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
