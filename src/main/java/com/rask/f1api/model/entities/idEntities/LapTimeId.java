package com.rask.f1api.model.entities.idEntities;

import com.rask.f1api.model.entities.Driver;
import com.rask.f1api.model.entities.Race;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class LapTimeId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race raceId;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;
    private Integer lap;

    public LapTimeId() {
    }

    public LapTimeId(Race raceId, Driver driverId, Integer lap) {
        this.raceId = raceId;
        this.driverId = driverId;
        this.lap = lap;
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
}
