package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.DriverStanding;
import com.rask.f1api.model.repository.DriverStandingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/driverStandings")
public class DriverStandingController {
    @Autowired
    private DriverStandingRepository driverStandingRepository;

    @GetMapping
    public Page<DriverStanding > findAll() {
        Pageable pageable = Pageable.ofSize(20);
        return (Page<DriverStanding>) driverStandingRepository.findAll(pageable);

    }
}
