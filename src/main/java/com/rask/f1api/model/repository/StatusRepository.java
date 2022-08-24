package com.rask.f1api.model.repository;

import com.rask.f1api.model.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
