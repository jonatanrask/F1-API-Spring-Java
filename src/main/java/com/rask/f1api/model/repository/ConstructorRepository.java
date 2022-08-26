package com.rask.f1api.model.repository;

import com.rask.f1api.model.dto.ConstructorDTO;
import com.rask.f1api.model.entities.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConstructorRepository extends JpaRepository<Constructor, Integer> {
    public List<ConstructorDTO> findByName(String name);
    @Query("select DISTINCT new com.rask.f1api.model.dto.ConstructorDTO (c.name, c.nationality, c.url) from Constructor c " +
            "join Result r " +
            "on c.constructorId = r.constructorId.constructorId " +
            "join Driver d " +
            "on d.driverId = r.driverId.driverId " +
            "where (d.driverRef like :driverRef)")
    public List<ConstructorDTO> findByDriver(@Param("driverRef") String driverRef);

    @Query("select DISTINCT new com.rask.f1api.model.dto.ConstructorDTO (c.name, c.nationality, c.url) from Constructor c " +
            "join Result r " +
            "on c.constructorId = r.constructorId.constructorId " +
            "join Race r2 " +
            "on r2.raceId = r.raceId.raceId " +
            "join ConstructorStanding cs " +
            "on r2.raceId = cs.raceId.raceId " +
            "where cs.position = :position")
    public List<ConstructorDTO> findByPosition(Integer position);

    @Query("select DISTINCT new com.rask.f1api.model.dto.ConstructorDTO (c.name, c.nationality, c.url) from Constructor c " +
            "join Result r " +
            "on c.constructorId = r.constructorId.constructorId " +
            "join Race r2 " +
            "on r2.raceId = r.raceId.raceId " +
            "join Season s " +
            "on s.seasonYear = r2.seasonYear.seasonYear " +
            "where s.seasonYear = :seasonYear")
    public List<ConstructorDTO> findBySeasonYear(@Param("seasonYear") Integer seasonYear);

    @Query("select DISTINCT new com.rask.f1api.model.dto.ConstructorDTO (c.name, c.nationality, c.url) from Constructor c " +
            "join Result r " +
            "on c.constructorId = r.constructorId.constructorId " +
            "join Race r2 " +
            "on r2.raceId = r.raceId.raceId " +
            "join Season s " +
            "on s.seasonYear = r2.seasonYear.seasonYear " +
            "where (s.seasonYear = :seasonYear) and (r2.round = :round)")
    public List<ConstructorDTO> findBySeasonYearAndRound(@Param("seasonYear") Integer seasonYear, @Param("round") Integer round);

    @Query("select DISTINCT new com.rask.f1api.model.dto.ConstructorDTO (c.name, c.nationality, c.url) from Constructor c " +
            "join Result r " +
            "on c.constructorId = r.constructorId.constructorId " +
            "join Race r2 " +
            "on r2.raceId = r.raceId.raceId " +
            "join Circuit c2 " +
            "on c2.circuitId = r2.circuitId.circuitId " +
            "join Driver d2 " +
            "on d2.driverId = r.driverId.driverId " +
            "where (d2.driverRef like :driverRef) and (c2.circuitRef like :circuitRef)")
    public List<ConstructorDTO> findByDriverAndCircuit(@Param("driverRef") String constructorRef, @Param("circuitRef") String circuitRef);

}
