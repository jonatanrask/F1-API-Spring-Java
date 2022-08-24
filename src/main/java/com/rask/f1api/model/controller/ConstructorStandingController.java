package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.ConstructorStanding;
import com.rask.f1api.model.repository.ConstructorStandingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/constructorStandings")
public class ConstructorStandingController {
    @Autowired
    private ConstructorStandingRepository constructorStandingRepository;

    @GetMapping
    public List<ConstructorStanding> findAll(){
        return constructorStandingRepository.findAll();
    }
}
