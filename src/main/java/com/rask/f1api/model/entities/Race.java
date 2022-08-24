package com.rask.f1api.model.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "races")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer raceId;
    @ManyToOne
    @JoinColumn(name = "season_year")
    private Season seasonYear;
    private Integer round;
    @ManyToOne
    @JoinColumn(name = "circuit_id")
    private Circuit circuitId;
    private String name;
    private LocalDate date;
    private LocalTime time;
    private String url;
    private LocalDate fp1Date;
    private LocalTime fp1Time;
    private LocalDate fp2Date;
    private LocalTime fp2Time;
    private LocalDate fp3Date;
    private LocalTime fp3Time;
    private LocalDate qualiDate;
    private LocalTime qualiTime;
    private LocalDate sprintDate;
    private LocalTime SprintTime;

    public Race() {
    }

    public Race(Integer raceId, Season seasonYear, Integer round, Circuit circuitId, String name, LocalDate date,
                LocalTime time, String url, LocalDate fp1Date, LocalTime fp1Time, LocalDate fp2Date, LocalTime fp2Time,
                LocalDate fp3Date, LocalTime fp3Time, LocalDate qualiDate, LocalTime qualiTime, LocalDate sprintDate,
                LocalTime sprintTime) {
        this.raceId = raceId;
        this.seasonYear = seasonYear;
        this.round = round;
        this.circuitId = circuitId;
        this.name = name;
        this.date = date;
        this.time = time;
        this.url = url;
        this.fp1Date = fp1Date;
        this.fp1Time = fp1Time;
        this.fp2Date = fp2Date;
        this.fp2Time = fp2Time;
        this.fp3Date = fp3Date;
        this.fp3Time = fp3Time;
        this.qualiDate = qualiDate;
        this.qualiTime = qualiTime;
        this.sprintDate = sprintDate;
        SprintTime = sprintTime;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Season getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(Season seasonYear) {
        this.seasonYear = seasonYear;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Circuit getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(Circuit circuitId) {
        this.circuitId = circuitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getFp1Date() {
        return fp1Date;
    }

    public void setFp1Date(LocalDate fp1Date) {
        this.fp1Date = fp1Date;
    }

    public LocalTime getFp1Time() {
        return fp1Time;
    }

    public void setFp1Time(LocalTime fp1Time) {
        this.fp1Time = fp1Time;
    }

    public LocalDate getFp2Date() {
        return fp2Date;
    }

    public void setFp2Date(LocalDate fp2Date) {
        this.fp2Date = fp2Date;
    }

    public LocalTime getFp2Time() {
        return fp2Time;
    }

    public void setFp2Time(LocalTime fp2Time) {
        this.fp2Time = fp2Time;
    }

    public LocalDate getFp3Date() {
        return fp3Date;
    }

    public void setFp3Date(LocalDate fp3Date) {
        this.fp3Date = fp3Date;
    }

    public LocalTime getFp3Time() {
        return fp3Time;
    }

    public void setFp3Time(LocalTime fp3Time) {
        this.fp3Time = fp3Time;
    }

    public LocalDate getQualiDate() {
        return qualiDate;
    }

    public void setQualiDate(LocalDate qualiDate) {
        this.qualiDate = qualiDate;
    }

    public LocalTime getQualiTime() {
        return qualiTime;
    }

    public void setQualiTime(LocalTime qualiTime) {
        this.qualiTime = qualiTime;
    }

    public LocalDate getSprintDate() {
        return sprintDate;
    }

    public void setSprintDate(LocalDate sprintDate) {
        this.sprintDate = sprintDate;
    }

    public LocalTime getSprintTime() {
        return SprintTime;
    }

    public void setSprintTime(LocalTime sprintTime) {
        SprintTime = sprintTime;
    }
}
