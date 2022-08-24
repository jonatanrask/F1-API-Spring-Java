package com.rask.f1api.model.entities;

import com.rask.f1api.model.entities.idEntities.PitStopId;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="pitStops")
@IdClass(PitStopId.class)
public class PitStop {
    @Id
    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race raceId;
    @Id
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;
    @Id
    private Integer stop;
    private Integer lap;
    private LocalTime time;
    private String duration;
    private Long milliseconds;

    public PitStop() {
    }

    public PitStop(Race raceId, Driver driverId, Integer stop, Integer lap, LocalTime time, String duration,
                   Long milliseconds) {
        this.raceId = raceId;
        this.driverId = driverId;
        this.stop = stop;
        this.lap = lap;
        this.time = time;
        this.duration = duration;
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

    public Integer getStop() {
        return stop;
    }

    public void setStop(Integer stop) {
        this.stop = stop;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Long milliseconds) {
        this.milliseconds = milliseconds;
    }
}
