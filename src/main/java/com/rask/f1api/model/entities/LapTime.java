package com.rask.f1api.model.entities;

import com.rask.f1api.model.entities.idEntities.LapTimeId;

import javax.persistence.*;

@Entity
@Table(name = "laptimes")
@IdClass(LapTimeId.class)
public class LapTime {
    @Id
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race raceId;
    @Id
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;
    @Id
    private Integer lap;
    private Integer position;
    private String time;
    private Long milliseconds;

    public LapTime() {
    }

    public LapTime(Race raceId, Driver driverId, Integer lap, Integer position, String time, Long milliseconds) {
        this.raceId = raceId;
        this.driverId = driverId;
        this.lap = lap;
        this.position = position;
        this.time = time;
        this.milliseconds = milliseconds;
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

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Long milliseconds) {
        this.milliseconds = milliseconds;
    }
}
