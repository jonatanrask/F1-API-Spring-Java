package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ResultRepository extends JpaRepository<Result, Integer> {

}
