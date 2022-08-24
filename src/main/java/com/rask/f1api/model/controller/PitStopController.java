package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.PitStop;
import com.rask.f1api.model.repository.PitStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pitStops")
public class PitStopController {
    @Autowired
    private PitStopRepository pitStopRepository;

    @GetMapping
    public List<PitStop> findAll(){
        return pitStopRepository.findAll();
    }

}
