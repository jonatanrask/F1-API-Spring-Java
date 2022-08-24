package com.rask.f1api.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "qualifying")
public class Qualifying {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qualifyId;
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race raceId;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;
    @ManyToOne
    @JoinColumn(name = "constructor_id")
    private Constructor constructorId;
    private Integer number;
    private Integer position;
    private String q1;
    private String q2;
    private String q3;


    public Qualifying() {
    }

    public Qualifying(Integer qualifyId, Integer number, Integer position, String q1, String q2, String q3,
                      Race raceId, Driver driverId, Constructor constructorId) {
        this.qualifyId = qualifyId;
        this.number = number;
        this.position = position;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.raceId = raceId;
        this.driverId = driverId;
        this.constructorId = constructorId;
    }

    public Integer getQualifyId() {
        return qualifyId;
    }

    public void setQualifyId(Integer qualifyId) {
        this.qualifyId = qualifyId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public Race getRaceId() {
        return raceId;
    }

    public void setRaceId(Race raceId) {
        this.raceId = raceId;
    }

    public Driver getDriverId() {
        return driverId;
    }

    public void setDriverId(Driver driverId) {
        this.driverId = driverId;
    }

    public Constructor getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(Constructor constructorId) {
        this.constructorId = constructorId;
    }
}
