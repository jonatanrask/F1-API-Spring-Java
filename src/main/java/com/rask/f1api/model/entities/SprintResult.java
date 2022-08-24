package com.rask.f1api.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "sprintResults")
public class SprintResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sprintResultId;
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
    private Integer grid;
    private Integer position;
    private String positionText;
    private Integer positionOrder;
    private Float points;
    private Integer laps;
    private String time;
    private Integer milliseconds;
    private Integer fastestLap;
    private String fastestLapTime;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status statusId;

    public SprintResult() {
    }

    public SprintResult(Integer sprintResultId, Race raceId, Driver driverId, Constructor constructorId, Integer number, Integer grid, Integer position, String positionText, Integer positionOrder,
                        Float points, Integer laps, String time, Integer milliseconds, Integer fastestLap,
                        String fastestLapTime, Status statusId) {
        this.sprintResultId = sprintResultId;
        this.raceId = raceId;
        this.driverId = driverId;
        this.constructorId = constructorId;
        this.number = number;
        this.grid = grid;
        this.position = position;
        this.positionText = positionText;
        this.positionOrder = positionOrder;
        this.points = points;
        this.laps = laps;
        this.time = time;
        this.milliseconds = milliseconds;
        this.fastestLap = fastestLap;
        this.fastestLapTime = fastestLapTime;
        this.statusId = statusId;
    }

    public Integer getSprintResultId() {
        return sprintResultId;
    }

    public void setSprintResultId(Integer sprintResultId) {
        this.sprintResultId = sprintResultId;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPositionText() {
        return positionText;
    }

    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    public Integer getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(Integer positionOrder) {
        this.positionOrder = positionOrder;
    }

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public Integer getLaps() {
        return laps;
    }

    public void setLaps(Integer laps) {
        this.laps = laps;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(Integer fastestLap) {
        this.fastestLap = fastestLap;
    }

    public String getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(String fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public Status getStatusId() {
        return statusId;
    }

    public void setStatusId(Status statusId) {
        this.statusId = statusId;
    }
}
