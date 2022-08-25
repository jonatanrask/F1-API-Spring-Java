package com.rask.f1api.model.controller;

import com.rask.f1api.model.dto.DriverDTO;
import com.rask.f1api.model.entities.Driver;
import com.rask.f1api.model.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drivers")
public class DriverController {
    @Autowired
    private DriverRepository driverRepository;

    @GetMapping
    public List<Driver> findAll(){
        return driverRepository.findAll();

    }
    @GetMapping("/name/{driverRef}")
    public List<DriverDTO> findDriverByName(@PathVariable(value = "driverRef") String driverRef){
        return driverRepository.findDriverByName(driverRef);
    }
    @GetMapping("/position/{positionString}")
    public List<DriverDTO> findByPosition(@PathVariable(value = "positionString") String positionString){
        int position = Integer.parseInt(positionString);
        return driverRepository.findDriverByPosition(position);
    }
    @GetMapping("/constructor/{constructorRef}")
    public List<DriverDTO> findByConstructor(@PathVariable(value = "constructorRef") String constructorRef){
        return driverRepository.findByConstructor(constructorRef);
    }
    @GetMapping("/circuit/{circuitsRef}")
    public List<DriverDTO> findByCircuit(@PathVariable(value = "circuitsRef") String circuitsRef){
        return driverRepository.findByCircuit(circuitsRef);
    }
    @GetMapping("/constructor/{constructorRef}/circuit/{circuitRef}")
    public List<DriverDTO> findByConstructorAndCircuit(@PathVariable(value = "constructorRef") String constructorRef,
                                                       @PathVariable(value = "circuitRef") String circuitRef){
        return driverRepository.findByConstructorAndCircuit(constructorRef, circuitRef);
    }
    @GetMapping("/{seasonYear}")
    public List<DriverDTO> findBySeasonYear(@PathVariable(value = "seasonYear") String seasonYearString){
        int seasonYear = Integer.parseInt(seasonYearString);
        return driverRepository.findBySeasonYear(seasonYear);
    }
    @GetMapping("/{seasonYear}/{round}")
    public List<DriverDTO> findBySeasonYearAndRound(@PathVariable(value = "seasonYear") String seasonYearString,
                                                    @PathVariable(value = "round") String roundString){
        int seasonYear = Integer.parseInt(seasonYearString);
        int round = Integer.parseInt(roundString);
        return driverRepository.findBySeasonYearAndRound(seasonYear, round);
    }
}
