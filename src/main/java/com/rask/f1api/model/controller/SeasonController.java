package com.rask.f1api.model.controller;

import com.rask.f1api.model.entities.Season;
import com.rask.f1api.model.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seasons")
public class SeasonController {
    @Autowired
    private SeasonRepository seasonRepository;

    @GetMapping
    public List<Season> findAll(){
        return seasonRepository.findAll();
    }
}
