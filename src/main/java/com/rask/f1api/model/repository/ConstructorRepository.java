package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConstructorRepository extends JpaRepository<Constructor, Integer> {

    public List<Constructor> findByName(String name);
}
