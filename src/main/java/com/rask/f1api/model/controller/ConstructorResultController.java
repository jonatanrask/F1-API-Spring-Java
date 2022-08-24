package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.ConstructorResult;
import com.rask.f1api.model.repository.ConstructorResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/constructorResults")
public class ConstructorResultController {
    @Autowired
    private ConstructorResultRepository constructorResultRepository;

    @GetMapping
    List<ConstructorResult> findAll(){
        return constructorResultRepository.findAll();
    }
}
