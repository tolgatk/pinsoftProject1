package com.tolga.pinsoftproject1.bussines.concrates;

import com.tolga.pinsoftproject1.bussines.abstracts.CarService;
import com.tolga.pinsoftproject1.dataAccess.abstracts.CarDao;
import com.tolga.pinsoftproject1.entities.concrates.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarManager implements CarService {

    private CarDao carDao;

    @Autowired
    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAll() {
        return this.carDao.findAll();
    }
}
