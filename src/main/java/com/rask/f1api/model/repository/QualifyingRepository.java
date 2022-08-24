package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.Qualifying;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualifyingRepository extends JpaRepository<Qualifying, Integer> {
}
