package com.rask.f1api.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "constructorResults")
public class ConstructorResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer constructorResultId;
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race raceId;
    @ManyToOne
    @JoinColumn(name = "constructor_id")
    private Constructor constructorId;
    private Float points;
    private String status;

    public ConstructorResult() {
    }

    public ConstructorResult(Integer constructorResultId, Race raceId, Constructor constructorId, Float points, String status) {
        this.constructorResultId = constructorResultId;
        this.raceId = raceId;
        this.constructorId = constructorId;
        this.points = points;
        this.status = status;
    }

    public Integer getConstructorResultId() {
        return constructorResultId;
    }

    public void setConstructorResultId(Integer constructorResultId) {
        this.constructorResultId = constructorResultId;
    }

    public Race getRaceId() {
        return raceId;
    }

    public void setRaceId(Race raceId) {
        this.raceId = raceId;
    }

    public Constructor getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(Constructor constructorId) {
        this.constructorId = constructorId;
    }

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
