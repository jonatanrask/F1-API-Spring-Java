package com.rask.f1api.model.dto;

public class ConstructorDTO {
    private String name;
    private String nationality;
    private String url;

    public ConstructorDTO(String name, String nationality, String url) {
        this.name = name;
        this.nationality = nationality;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
