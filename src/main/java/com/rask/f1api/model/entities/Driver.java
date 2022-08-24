package com.rask.f1api.model.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer driverId;
    private String driverRef;
    private Integer number;
    private String code;
    private String foreName;
    private String surName;
    private LocalDate dob;
    private String nationality;
    private String url;

    public Driver() {
    }

    public Driver(Integer driverId, String driverRef, Integer number, String code, String foreName, String surName,
                  LocalDate dob, String nationality, String url) {
        this.driverId = driverId;
        this.driverRef = driverRef;
        this.number = number;
        this.code = code;
        this.foreName = foreName;
        this.surName = surName;
        this.dob = dob;
        this.nationality = nationality;
        this.url = url;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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
