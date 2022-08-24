package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.PitStop;
import com.rask.f1api.model.entities.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PitStopRepository extends JpaRepository<PitStop, Race> {
}
