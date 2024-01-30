package com.tolga.pinsoftproject1.dataAccess.abstracts;

import com.tolga.pinsoftproject1.entities.concrates.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car,Integer> {



}
