package com.rask.f1api.model.repository;

import com.rask.f1api.model.dto.CircuitDTO;
import com.rask.f1api.model.entities.Circuit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CircuitRepository extends JpaRepository<Circuit, Integer> {
    public List<Circuit> findByName(String name);

    @Query("select DISTINCT new com.rask.f1api.model.dto.CircuitDTO (c.name,c.location ,c.country, c.url) from Circuit c " +
            "join Race r " +
            "on c.circuitId = r.circuitId.circuitId " +
            "where r.seasonYear.seasonYear = :seasonYear ")
    public List<CircuitDTO> findBySeasonYear(Integer seasonYear);

    @Query("select DISTINCT new com.rask.f1api.model.dto.CircuitDTO (c.name,c.location ,c.country, c.url) from Circuit c " +
            "join Race r " +
            "on c.circuitId = r.circuitId.circuitId " +
            "where (r.seasonYear.seasonYear = :seasonYear) and (r.round = :round)")
    public List<CircuitDTO> findBySeasonYearAndRound(Integer seasonYear, Integer round);

    @Query("select DISTINCT new com.rask.f1api.model.dto.CircuitDTO (c.name,c.location ,c.country, c.url) from Circuit c " +
            "join Race r " +
            "on c.circuitId = r.circuitId.circuitId " +
            "join Result r2 " +
            "on r.raceId = r2.raceId.raceId " +
            "join Constructor c2 " +
            "on c2.constructorId = r2.constructorId.constructorId " +
            "join Driver d " +
            "on d.driverId = r2.driverId.driverId " +
            "where (c2.constructorRef like :constructorRef) and (d.driverRef like :driverRef)")
    public List<CircuitDTO> findByDriverAndConstructor(String driverRef, String constructorRef);
}
