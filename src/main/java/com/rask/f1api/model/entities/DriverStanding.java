package com.rask.f1api.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "driverStandings")
public class DriverStanding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer driverStandingId;
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race raceId;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;
    private Float points;
    private Integer position;
    private String positionText;
    private Integer wins;

    public DriverStanding() {
    }

    public DriverStanding(Integer driverStandingId, Race raceId, Driver driverId, Float points, Integer position, String positionText, Integer wins) {
        this.driverStandingId = driverStandingId;
        this.raceId = raceId;
        this.driverId = driverId;
        this.points = points;
        this.position = position;
        this.positionText = positionText;
        this.wins = wins;
    }

    public Integer getDriverStandingId() {
        return driverStandingId;
    }

    public void setDriverStandingId(Integer driverStandingId) {
        this.driverStandingId = driverStandingId;
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

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
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

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }
}
