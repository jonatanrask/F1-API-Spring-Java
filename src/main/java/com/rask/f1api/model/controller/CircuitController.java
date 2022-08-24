package com.rask.f1api.model.controller;

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
    /*
    @GetMapping("/{name}")
    public List<Circuit> findByName(@PathVariable(value = "name") String name){
        return circuitRepository.findByName(name);
    }
     */

}
