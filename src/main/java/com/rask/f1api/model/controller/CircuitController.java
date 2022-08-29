package com.rask.f1api.model.controller;

import com.rask.f1api.model.dto.CircuitDTO;
import com.rask.f1api.model.entities.Circuit;
import com.rask.f1api.model.repository.CircuitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/circuits")
public class CircuitController {

    @Autowired
    private CircuitRepository circuitRepository;

    @GetMapping
    public List<Circuit> findAll() {
        return circuitRepository.findAll();

    }

    @GetMapping("/name/{name}")
    public List<Circuit> findByName(@PathVariable(value = "name") String name){
        return circuitRepository.findByName(name);
    }
    @GetMapping("/year/{year}")
    public List<CircuitDTO> findBySeasonYear(@PathVariable(value = "year") String year){
        int seasonYear = Integer.parseInt(year);
        return circuitRepository.findBySeasonYear(seasonYear);
    }
    @GetMapping("/year/{year}/round/{round}")
    public List<CircuitDTO> findBySeasonYearAndRound(@PathVariable(value = "year") String year, @PathVariable(value = "round") String round){
        int seasonYear = Integer.parseInt(year);
        int roundInt = Integer.parseInt(round);
        return circuitRepository.findBySeasonYearAndRound(seasonYear, roundInt);
    }
    @GetMapping("/driver/{driverRef}/constructor/{constructorRef}")
    public List<CircuitDTO> findByDriverAndContructor(@PathVariable(value = "driverRef") String driverRef, @PathVariable(value = "constructorRef") String constructorRef){
        return circuitRepository.findByDriverAndConstructor(driverRef, constructorRef);
    }


}
