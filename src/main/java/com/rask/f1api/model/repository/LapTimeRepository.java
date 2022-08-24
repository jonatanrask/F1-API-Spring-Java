package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.LapTime;
import com.rask.f1api.model.entities.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LapTimeRepository extends JpaRepository<LapTime, Race> {
}
