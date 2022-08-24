package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.Result;
import com.rask.f1api.model.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;

    @GetMapping
    public List<Result> findAll(){
        return resultRepository.findAll();
    }
}
