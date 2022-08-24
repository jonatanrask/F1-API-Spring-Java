package com.rask.f1api.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "seasons")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seasonYear;
    private String url;

    public Season() {
    }

    public Season(Integer seasonYear, String url) {
        this.seasonYear = seasonYear;
        this.url = url;
    }

    public Integer getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(Integer seasonYear) {
        this.seasonYear = seasonYear;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
