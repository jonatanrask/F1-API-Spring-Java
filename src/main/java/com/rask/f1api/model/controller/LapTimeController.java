package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.DriverStanding;
import com.rask.f1api.model.entities.LapTime;
import com.rask.f1api.model.repository.LapTimeRepository;
import com.rask.f1api.model.repository.PitStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laptimes")
public class LapTimeController {
    @Autowired
    private LapTimeRepository lapTimeRepository;

    @GetMapping
    public Page<LapTime> findAll(){
        Pageable pageable = Pageable.ofSize(20);
        return (Page<LapTime>) lapTimeRepository.findAll(pageable);
    }
}
