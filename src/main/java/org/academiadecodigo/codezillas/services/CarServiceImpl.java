package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.dao.CarDao;
import org.academiadecodigo.codezillas.persistence.model.Car;
import org.academiadecodigo.codezillas.persistence.model.Client;
import org.academiadecodigo.codezillas.persistence.model.components.ComponentsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Transactional
    @Override
    public void addCar(String licensePlate, String brand, String model, Integer horsepower, Client client) {
        Car car = new Car();
        car.setLicensePlate(licensePlate);
        car.setBrand(brand);
        car.setModel(model);
        car.setHorsePower(horsepower);
        car.setClient(client);
        car.setComponentsList(new ComponentsList());

        carDao.saveOrUpdate(car);
    }

    @Override
    public Car getCarById(Integer id) {
        return carDao.findById(id);
    }

    @Override
    public Car getCarByLicensePlate(String licensePlate) {
        return carDao.findByLicensePlate(licensePlate);
    }

    @Override
    public List<Car> carsList() {
        return carDao.findAll();
    }

    @Override
    public void tuneElectronics(Integer id, String option) {
        Car car = carDao.findById(id);
    }

    @Override
    public void tuneStage(Integer id, String option) {
        Car car = carDao.findById(id);
    }

    @Override
    public void tuneSuspension(Integer id, String option) {
        Car car = carDao.findById(id);
    }

    @Override
    public void tuneTires(Integer id, String option) {
        Car car = carDao.findById(id);
    }

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }
}
