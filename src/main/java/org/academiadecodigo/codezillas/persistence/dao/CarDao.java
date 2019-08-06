package org.academiadecodigo.codezillas.persistence.dao;

import org.academiadecodigo.codezillas.persistence.model.Car;

public interface CarDao extends Dao<Car> {

    Car findByLicensePlate(String licensePlate);

}
