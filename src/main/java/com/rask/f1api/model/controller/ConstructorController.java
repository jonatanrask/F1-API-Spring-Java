package com.rask.f1api.model.controller;

import com.rask.f1api.model.dto.ConstructorDTO;
import com.rask.f1api.model.entities.Constructor;
import com.rask.f1api.model.repository.ConstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/constructors")
public class ConstructorController {

    @Autowired
    private ConstructorRepository constructorRepository;

    @GetMapping
    public List<Constructor> findAll(){
        return constructorRepository.findAll();

    }
    @GetMapping("/name/{name}")
    public List<ConstructorDTO> findByName(@PathVariable(value = "name") String name){
        return constructorRepository.findByName(name);
    }
    @GetMapping("/driver/{driverRef}")
    public List<ConstructorDTO> findByDriver(@PathVariable(value = "driverRef") String driverRef){
        return constructorRepository.findByDriver(driverRef);
    }
    @GetMapping("/position/{positionString}")
    public List<ConstructorDTO> findByPosition(@PathVariable(value = "positionString") String positionString){
        int position = Integer.parseInt(positionString);
        return constructorRepository.findByPosition(position);
    }
    @GetMapping("/season/{seasonYear}")
    public List<ConstructorDTO> findBySeasonYear(@PathVariable(value = "seasonYear") String seasonYearString){
        int seasonYear = Integer.parseInt(seasonYearString);
        return constructorRepository.findBySeasonYear(seasonYear);
    }
    @GetMapping("/season/{seasonYear}/round/{round}")
    public List<ConstructorDTO> findBySeasonYearAndRound(@PathVariable(value = "seasonYear") String seasonYearString,
                                                    @PathVariable(value = "round") String roundString){
        int seasonYear = Integer.parseInt(seasonYearString);
        int round = Integer.parseInt(roundString);
        return constructorRepository.findBySeasonYearAndRound(seasonYear, round);
    }
    @GetMapping("/drivers/{driverRef}/circuits/{circuitRef}/")
    public List<ConstructorDTO> findByDriverAndCircuit(@PathVariable(value = "driverRef") String driverRef,
                                                       @PathVariable(value = "circuitRef") String circuitRef){
        return constructorRepository.findByDriverAndCircuit(driverRef, circuitRef);
    }
}
