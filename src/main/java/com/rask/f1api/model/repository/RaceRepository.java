package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.Race;
import com.rask.f1api.model.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RaceRepository extends JpaRepository<Race, Integer> {
}
