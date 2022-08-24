package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.DriverStanding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverStandingRepository extends JpaRepository<DriverStanding, Integer> {
}
