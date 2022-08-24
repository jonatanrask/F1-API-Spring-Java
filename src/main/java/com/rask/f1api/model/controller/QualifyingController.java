package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.Qualifying;
import com.rask.f1api.model.repository.QualifyingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/qualifying")
public class QualifyingController {
    @Autowired
    private QualifyingRepository qualifyingRepository;

    @GetMapping
    public List<Qualifying> findAll(){
        return qualifyingRepository.findAll();
    }
}
