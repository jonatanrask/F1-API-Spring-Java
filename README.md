# API Formula 1

# Description
The project provides a REST API of historical records of Formula 1 races, since the beginning of the world championships in 1950. For non-commercial purposes. Inspired by [ErgastApi.](https://ergast.com/mrd/)

# Drivers EndPoints

- Returns all drivers that have raced in F1: 

```
https://f1api-rask.herokuapp.com/drivers

```
- This endpoint is to obtain a list of all drivers in a particular season (year)
```
https://f1api-rask.herokuapp.com/drivers/{seasonYear}

```
- This endpoint is to obtain a list of all drivers in a particular race(round) of a season(year)

```
https://f1api-rask.herokuapp.com/drivers/{seasonYear}/{round}

```
- Each driver listed in the response is identified by a unique driverId which is used to identify the driver throughout the API. To obtain information about a particular driver append the driverId This endpoint is to obtain the information of a particular driver based on the driver_ref
```
https://f1api-rask.herokuapp.com/drivers/name/{driver_ref}
```

- This endpoint is to obtain all drivers who have driven for a specific constructor at a particular circuit:
```
https://f1api-rask.herokuapp.com/drivers/constructor/mclaren/circuit/monza
```

- This endpoint is to obtain all to list the drivers who have achieved a particular final position in the championship:
```
https://f1api-rask.herokuapp.com/drivers/position/{position}
```

# Constructors EndPoints


- Returns all teams that have already participated in F1: https://f1api-rask.herokuapp.com/constructors;

- Returns all circuits that F1 has raced: https://f1api-rask.herokuapp.com/circuits;

- Returns all F1 seasons: https://f1api-rask.herokuapp.com/seasons;

- Returns data from all F1 steps: https://f1api-rask.herokuapp.com/races;

- Returns data for all F1 qualifications: https://f1api-rask.herokuapp.com/qualifying;

- Returns all F1 Sprint race results: https://f1api-rask.herokuapp.com/sprintResults;

- Returns the final status of a pilot in a result: https://f1api-rask.herokuapp.com/status;

- Returns the result of all F1 races: https://f1api-rask.herokuapp.com/results;

- Returns F1 pitstops data: https://f1api-rask.herokuapp.com/pitStops;

- Returns the data of all laps already made in F1: https://f1api-rask.herokuapp.com/laptimes;

- Returns all drivers results in certain races: https://f1api-rask.herokuapp.com/driverStandings;

- Returns all constructors results in certain races: https://f1api-rask.herokuapp.com/constructorStandings;

- Return all constructor results: https://f1api-rask.herokuapp.com/constructorResults.


_More endpoints will be accessible as development progresses._

## UML Modeling
![UML](https://github.com/jonatanrask/F1-API-Spring-Java/blob/main/uml-diagram/uml.svg)

## Guia das tabelas

| Table guide         |  
| ------------------- |
|  drivers            |
|  constructors       | 
|  circuits           |
|  seasons            |
|  races              |
|  qualifying         |
|  sprintResults      |
|  status             |
|  results            |
|  pitstops           |
|  laptimes           |
|  driversStandings   |
| constructorStandings|
| constructorResults  | 

- ### Drivers

| Field       | Type         | Null | Key | Default | Extra          | Description              |
|-------------|--------------|------|-----|---------|----------------|--------------------------|
| driverId    | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key              |
| driverRef   | varchar(255) | NO   |     |         |                | Unique driver identifier |
| number      | int(11)      | YES  |     | NULL    |                | Permanent driver number  |
| code        | varchar(3)   | YES  |     | NULL    |                | Driver code e.g. "ALO"   |     
| forename    | varchar(255) | NO   |     |         |                | Driver forename          |
| surname     | varchar(255) | NO   |     |         |                | Driver surname           |
| dob         | date         | YES  |     | NULL    |                | Driver date of birth     |
| nationality | varchar(255) | YES  |     | NULL    |                | Driver nationality       |
| url         | varchar(255) | NO   | UNI |         |                | Driver Wikipedia page    |

- ### Constructors

| Field          | Type         | Null | Key | Default | Extra          | Description                   |
|----------------|--------------|------|-----|---------|----------------|-------------------------------|
| constructorId  | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                   |
| constructorRef | varchar(255) | NO   |     |         |                | Unique constructor identifier |
| name           | varchar(255) | NO   | UNI |         |                | Constructor name              |
| nationality    | varchar(255) | YES  |     | NULL    |                | Constructor nationality       |
| url            | varchar(255) | NO   |     |         |                | Constructor Wikipedia page    |

- ### Circuits

| Field      | Type         | Null | Key | Default | Extra          | Description               |
|------------|--------------|------|-----|---------|----------------|---------------------------|
| circuitId  | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key               |
| circuitRef | varchar(255) | NO   |     |         |                | Unique circuit identifier |
| name       | varchar(255) | NO   |     |         |                | Nome do Circuito          |
| location   | varchar(255) | YES  |     | NULL    |                | Local                     |
| country    | varchar(255) | YES  |     | NULL    |                | Nome da cidade            |
| lat        | float        | YES  |     | NULL    |                | Latitude                  |
| lng        | float        | YES  |     | NULL    |                | Longitude                 |
| alt        | int(11)      | YES  |     | NULL    |                | Altitude                  |
| url        | varchar(255) | NO   | UNI |         |                | Circuit Wikipedia page    |

- ### Seasons

| Field | Type         | Null | Key | Default | Extra | Description           |
|-------|--------------|------|-----|---------|-------|-----------------------|
| year  | int(11)      | NO   | PRI | 0       |       | Primary key e.g. 1950 |
| url   | varchar(255) | NO   | UNI |         |       | Season Wikipedia page |

- ### Races

| Field       | Type         | Null | Key | Default    | Extra          | Description                        |
|-------------|--------------|------|-----|------------|----------------|------------------------------------|
| raceId      | int(11)      | NO   | PRI | NULL       | auto_increment | Primary key                        |
| year        | int(11)      | NO   |     | 0          |                | Foreign key link to seasons table  |
| round       | int(11)      | NO   |     | 0          |                | Round number                       |
| circuitId   | int(11)      | NO   |     | 0          |                | Foreign key link to circuits table |
| name        | varchar(255) | NO   |     |            |                | Race name                          | 
| date        | date         | NO   |     | 0000-00-00 |                | Race date e.g. "1950-05-13"        |
| time        | time         | YES  |     | NULL       |                | Race start time e.g."13:00:00"     |
| url         | varchar(255) | YES  | UNI | NULL       |                | Race Wikipedia page                |
| fp1_date    | date         | YES  |     | NULL       |                | FP1 date                           |
| fp1_time    | time         | YES  |     | NULL       |                | FP1 start time                     |
| fp2_date    | date         | YES  |     | NULL       |                | FP2 date                           |
| fp2_time    | time         | YES  |     | NULL       |                | FP2 start time                     |
| fp3_date    | date         | YES  |     | NULL       |                | FP3 date                           |
| fp3_time    | time         | YES  |     | NULL       |                | FP3 start time                     |
| quali_date  | date         | YES  |     | NULL       |                | Qualifying date                    |
| quali_time  | time         | YES  |     | NULL       |                | Qualifying start time              |
| sprint_date | date         | YES  |     | NULL       |                | Sprint date                        |
| sprint_time | time         | YES  |     | NULL       |                | Sprint start time                  |

- ### Qualifying


| Field         | Type         | Null | Key | Default | Extra          | Description                            |
|---------------|--------------|------|-----|---------|----------------|----------------------------------------|
| qualifyId     | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                            |
| raceId        | int(11)      | NO   |     | 0       |                | Foreign key link to races table        |
| driverId      | int(11)      | NO   |     | 0       |                | Foreign key link to drivers table      |
| constructorId | int(11)      | NO   |     | 0       |                | Foreign key link to constructors table |
| number        | int(11)      | NO   |     | 0       |                | Driver number                          |
| position      | int(11)      | YES  |     | NULL    |                | Qualifying position                    |
| q1            | varchar(255) | YES  |     | NULL    |                | Q1 lap time e.g. "1:21.374"            |
| q2            | varchar(255) | YES  |     | NULL    |                | Q2 lap time                            |
| q3            | varchar(255) | YES  |     | NULL    |                | Q3 lap time                            |

- ### Sprint Results

| Field           | Type         | Null | Key | Default | Extra          | Description                                 |
|-----------------|--------------|------|-----|---------|----------------|---------------------------------------------|
| sprintResultId  | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                                 |
| raceId          | int(11)      | NO   |     | 0       |                | Foreign key link to races table             |
| driverId        | int(11)      | NO   |     | 0       |                | Foreign key link to drivers table           |
| constructorId   | int(11)      | NO   |     | 0       |                | Foreign key link to constructors table      |
| number          | int(11)      | YES  |     | NULL    |                | Driver number                               |
| grid            | int(11)      | NO   |     | 0       |                | Starting grid position                      |
| position        | int(11)      | YES  |     | NULL    |                | Official classification, if applicable      |
| positionText    | varchar(255) | NO   |     |         |                | Driver position string e.g. "1" or "R"      |
| positionOrder   | int(11)      | NO   |     | 0       |                | Driver position for ordering purposes       |
| points          | float        | NO   |     | 0       |                | Driver points for race                      |
| laps            | int(11)      | NO   |     | 0       |                | Number of completed laps                    |
| time            | varchar(255) | YES  |     | NULL    |                | Finishing time or gap                       |
| milliseconds    | int(11)      | YES  |     | NULL    |                | Finishing time in milliseconds              |   
| fastestLap      | int(11)      | YES  |     | NULL    |                | Lap number of fastest lap                   |
| fastestLapTime  | varchar(255) | YES  |     | NULL    |                | Fastest lap time e.g. "1:27.453"            |
| statusId        | int(11)      | NO   |     | 0       |                | Foreign key link to status table            |

- ### Status


| Field    | Type         | Null | Key | Default | Extra          | Description                     |
|----------|--------------|------|-----|---------|----------------|---------------------------------|
| statusId | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                     |
| status   | varchar(255) | NO   |     |         |                | Finishing status e.g. "Retired" |

- ### Results

| Field           | Type         | Null | Key | Default | Extra          | Description                                 |
|-----------------|--------------|------|-----|---------|----------------|---------------------------------------------|
| resultId        | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                                 |
| raceId          | int(11)      | NO   |     | 0       |                | Foreign key link to races table             |
| driverId        | int(11)      | NO   |     | 0       |                | Foreign key link to drivers table           |
| constructorId   | int(11)      | NO   |     | 0       |                | Foreign key link to constructors table      |
| number          | int(11)      | YES  |     | NULL    |                | Driver number                               |
| grid            | int(11)      | NO   |     | 0       |                | Starting grid position                      |
| position        | int(11)      | YES  |     | NULL    |                | Official classification, if applicable      |
| positionText    | varchar(255) | NO   |     |         |                | Driver position string e.g. "1" or "R"      |
| positionOrder   | int(11)      | NO   |     | 0       |                | Driver position for ordering purposes       |
| points          | float        | NO   |     | 0       |                | Driver points for race                      |
| laps            | int(11)      | NO   |     | 0       |                | Number of completed laps                    |
| time            | varchar(255) | YES  |     | NULL    |                | Finishing time or gap                       |
| milliseconds    | int(11)      | YES  |     | NULL    |                | Finishing time in milliseconds              |   
| fastestLap      | int(11)      | YES  |     | NULL    |                | Lap number of fastest lap                   |
| rank            | int(11)      | YES  |     | 0       |                | Fastest lap rank, compared to other drivers |
| fastestLapTime  | varchar(255) | YES  |     | NULL    |                | Fastest lap time e.g. "1:27.453"            |
| fastestLapSpeed | varchar(255) | YES  |     | NULL    |                | Fastest lap speed (km/h) e.g. "213.874"     |
| statusId        | int(11)      | NO   |     | 0       |                | Foreign key link to status table            |

- ### PitStops


| Field        | Type         | Null | Key | Default | Extra | Description                       |
|--------------|--------------|------|-----|---------|-------|-----------------------------------|
| raceId       | int(11)      | NO   | PRI | NULL    |       | Foreign key link to races table   |
| driverId     | int(11)      | NO   | PRI | NULL    |       | Foreign key link to drivers table |
| stop         | int(11)      | NO   | PRI | NULL    |       | Stop number                       |
| lap          | int(11)      | NO   |     | NULL    |       | Lap number                        |
| time         | time         | NO   |     | NULL    |       | Time of stop e.g. "13:52:25"      |
| duration     | varchar(255) | YES  |     | NULL    |       | Duration of stop e.g. "21.783"    |
| milliseconds | int(11)      | YES  |     | NULL    |       | Duration of stop in milliseconds  |

- ### Laptimes


| Field        | Type         | Null | Key | Default | Extra | Description                       |
|--------------|--------------|------|-----|---------|-------|-----------------------------------|
| raceId       | int(11)      | NO   | PRI | NULL    |       | Foreign key link to races table   |
| driverId     | int(11)      | NO   | PRI | NULL    |       | Foreign key link to drivers table |
| lap          | int(11)      | NO   | PRI | NULL    |       | Lap number                        |
| position     | int(11)      | YES  |     | NULL    |       | Driver race position              |
| time         | varchar(255) | YES  |     | NULL    |       | Lap time e.g. "1:43.762"          |
| milliseconds | int(11)      | YES  |     | NULL    |       | Lap time in milliseconds          |4

- ### driverStandings

| Field             | Type         | Null | Key | Default | Extra          | Description                         |
|-------------------|--------------|------|-----|---------|----------------|-------------------------------------|
| driverStandingsId | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                         |
| raceId            | int(11)      | NO   |     | 0       |                | Foreign key link to races table     |
| driverId          | int(11)      | NO   |     | 0       |                | Foreign key link to drivers table   |
| points            | float        | NO   |     | 0       |                | Driver points for season            |
| position          | int(11)      | YES  |     | NULL    |                | Driver standings position (integer) |
| positionText      | varchar(255) | YES  |     | NULL    |                | Driver standings position (string)  |
| wins              | int(11)      | NO   |     | 0       |                | Season win count                    |

- ### constructorStandings

| Field                  | Type         | Null | Key | Default | Extra          | Description                              |
|------------------------|--------------|------|-----|---------|----------------|------------------------------------------|
| constructorStandingsId | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                              |
| raceId                 | int(11)      | NO   |     | 0       |                | Foreign key link to races table          |
| constructorId          | int(11)      | NO   |     | 0       |                | Foreign key link to constructors table   |
| points                 | float        | NO   |     | 0       |                | Constructor points for season            |
| position               | int(11)      | YES  |     | NULL    |                | Constructor standings position (integer) |
| positionText           | varchar(255) | YES  |     | NULL    |                | Constructor standings position (string)  |
| wins                   | int(11)      | NO   |     | 0       |                | Season win count                         |

- ### constructorResult

| Field                | Type         | Null | Key | Default | Extra          | Description                            |
|----------------------|--------------|------|-----|---------|----------------|----------------------------------------|
| constructorResultsId | int(11)      | NO   | PRI | NULL    | auto_increment | Primary key                            |
| raceId               | int(11)      | NO   |     | 0       |                | Foreign key link to races table        |
| constructorId        | int(11)      | NO   |     | 0       |                | Foreign key link to constructors table |
| points               | float        | YES  |     | NULL    |                | Constructor points for race            |
| status               | varchar(255) | YES  |     | NULL    |                | "D" for disqualified (or null)         |