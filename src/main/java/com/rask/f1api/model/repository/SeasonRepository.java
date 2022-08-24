package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeasonRepository extends JpaRepository<Season, Integer> {
}
