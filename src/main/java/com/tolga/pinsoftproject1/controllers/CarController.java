package com.tolga.pinsoftproject1.controllers;


import com.tolga.pinsoftproject1.bussines.abstracts.CarService;
import com.tolga.pinsoftproject1.entities.concrates.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@CrossOrigin
public class CarController {

    private CarService carService;


    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getCars")
    public List<Car> getCars(){
        return this.carService.getAll();



    }

}
