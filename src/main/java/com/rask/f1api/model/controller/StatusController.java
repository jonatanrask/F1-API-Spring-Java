package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.Status;
import com.rask.f1api.model.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    private StatusRepository statusRepository;

    @GetMapping
    public List<Status> findAll(){
        return statusRepository.findAll();
    }
}
