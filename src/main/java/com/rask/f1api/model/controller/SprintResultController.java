package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.SprintResult;
import com.rask.f1api.model.repository.SprintResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sprintResults")
public class SprintResultController {
    @Autowired
    private SprintResultRepository sprintResultRepository;

    @GetMapping
    public List<SprintResult> findAll(){
        return sprintResultRepository.findAll();
    }
}
