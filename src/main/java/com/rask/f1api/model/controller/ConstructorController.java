package com.rask.f1api.model.controller;

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
    /*
    @GetMapping("/{name}")
    public List<Constructor> findByName(@PathVariable(value = "name") String name){
        return constructorRepository.findByName(name);

    }
     */

}
