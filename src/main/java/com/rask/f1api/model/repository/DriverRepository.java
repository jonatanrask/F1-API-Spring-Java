package com.rask.f1api.model.repository;

import com.rask.f1api.model.dto.DriverDTO;
import com.rask.f1api.model.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
    @Query("select DISTINCT new com.rask.f1api.model.dto.DriverDTO  (d.driverId, d.driverRef, d.number ,d.nationality, d.dob, d.url) from Driver d "
            + "where d.driverRef = :driverRef")
    public List<DriverDTO> findDriverByName(String driverRef);
    @Query("select DISTINCT new com.rask.f1api.model.dto.DriverDTO  (d.driverId, d.driverRef, d.number ,d.nationality, d.dob, d.url) from Driver d "
            + "join DriverStanding ds " +
            "on d.driverId = ds.driverId.driverId " +
            "where ds.position = :position")
    public List<DriverDTO> findDriverByPosition(Integer position);
    @Query("select DISTINCT new com.rask.f1api.model.dto.DriverDTO  (d.driverId, d.driverRef, d.number ,d.nationality, d.dob, d.url) from Driver d " +
            "join Result r " +
            "on d.driverId = r.driverId.driverId " +
            "join Constructor c " +
            "on r.constructorId.constructorId = c.constructorId " +
            "where (c.constructorRef like :constructorRef)")
    public List<DriverDTO> findByConstructor(@Param("constructorRef") String constructorRef);
    @Query("select DISTINCT new com.rask.f1api.model.dto.DriverDTO  (d.driverId, d.driverRef, d.number ,d.nationality, d.dob, d.url) from Driver d " +
            "join Result r " +
            "on d.driverId = r.driverId.driverId " +
            "join Race r2 " +
            "on r2.raceId = r.raceId.raceId " +
            "join Circuit c " +
            "on r2.circuitId.circuitId = c.circuitId " +
            "where c.circuitRef like :circuitRef")
    public List<DriverDTO> findByCircuit(@Param("circuitRef") String circuitRef);

    @Query("select DISTINCT new com.rask.f1api.model.dto.DriverDTO  (d.driverId, d.driverRef, d.number ,d.nationality, d.dob, d.url) from Driver d " +
            "join Result r " +
            "on d.driverId = r.driverId.driverId " +
            "join Race r2 " +
            "on r2.raceId = r.raceId.raceId " +
            "join Circuit c " +
            "on r2.circuitId.circuitId = c.circuitId " +
            "join Constructor c2 " +
            "on r.constructorId.constructorId = c2.constructorId " +
            "where (c2.constructorRef like :constructorRef) and (c.circuitRef like :circuitRef)")
    public List<DriverDTO> findByConstructorAndCircuit(@Param("constructorRef") String constructorRef, @Param("circuitRef") String circuitRef);
    @Query("select DISTINCT new com.rask.f1api.model.dto.DriverDTO  (d.driverId, d.driverRef, d.number ,d.nationality, d.dob, d.url) from Driver d " +
                  "join Result r " +
                  "on d.driverId = r.driverId.driverId " +
                  "join Race r2 " +
                  "on r2.raceId = r.raceId.raceId " +
                  "join Season s " +
                  "on s.seasonYear = r2.seasonYear.seasonYear " +
                  "where s.seasonYear = :seasonYear")
    public List<DriverDTO> findBySeasonYear(@Param("seasonYear") Integer seasonYear);
    @Query("select DISTINCT new com.rask.f1api.model.dto.DriverDTO  (d.driverId, d.driverRef, d.number ,d.nationality, d.dob, d.url) from Driver d " +
            "join Result r " +
            "on d.driverId = r.driverId.driverId " +
            "join Race r2 " +
            "on r2.raceId = r.raceId.raceId " +
            "join Season s " +
            "on s.seasonYear = r2.seasonYear.seasonYear " +
            "where (s.seasonYear = :seasonYear) and (r2.round = :round)")
    public List<DriverDTO> findBySeasonYearAndRound(@Param("seasonYear") Integer seasonYear, @Param("round") Integer round);

}
