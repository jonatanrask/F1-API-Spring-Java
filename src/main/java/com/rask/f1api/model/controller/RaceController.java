package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.Race;
import com.rask.f1api.model.entities.Season;
import com.rask.f1api.model.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/races")
public class RaceController {
    @Autowired
    private RaceRepository raceRepository;

    @GetMapping
    public List<Race> findAll(){
        return raceRepository.findAll();
    }
}
