package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.Circuit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CircuitRepository extends JpaRepository<Circuit, Integer> {
    public List<Circuit> findByName(String name);
}
