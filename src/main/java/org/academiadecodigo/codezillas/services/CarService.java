package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.model.Car;
import org.academiadecodigo.codezillas.persistence.model.Client;

import java.util.List;

public interface CarService {

    void addCar(String licensePlate, String brand, String model, Integer horsepower, Client client);
    Car getCarById(Integer id);
    Car getCarByLicensePlate(String licensePlate);
    List<Car> carsList();
    void tuneElectronics(Integer id, String option);
    void tuneStage(Integer id, String option);
    void tuneSuspension(Integer id, String option);
    void tuneTires(Integer id, String option);

}
