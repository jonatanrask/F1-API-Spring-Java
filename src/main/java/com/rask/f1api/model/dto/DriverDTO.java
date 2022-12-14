package com.rask.f1api.model.dto;

import java.time.LocalDate;

public class DriverDTO {
    private Integer id;
    private String driverRef;
    private Integer number;
    private String nationality;
    private LocalDate dob;
    private String url;

    public DriverDTO(Integer id, String driverRef, Integer number, String nationality, LocalDate dob, String url) {
        this.driverRef = driverRef;
        this.number = number;
        this.nationality = nationality;
        this.dob = dob;
        this.url = url;
        this.id = id;
    }

    public String getDriverRef() {
        return driverRef;
    }

    public void setDriverRef(String driverRef) {
        this.driverRef = driverRef;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
