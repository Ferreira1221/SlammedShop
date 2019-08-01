package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Owner;
import org.academiadecodigo.codezillas.persistence.model.Car;
import org.academiadecodigo.codezillas.persistence.model.components.Electronics;
import org.academiadecodigo.codezillas.persistence.model.components.Stage;
import org.academiadecodigo.codezillas.persistence.model.components.Suspension;
import org.academiadecodigo.codezillas.persistence.model.components.Tires;

import java.util.List;

public interface UserServiceInt {



    void addOwner(Owner owner);

    void addCar(Integer ownerId, Car car);

    void addTire(Tires tire);

    void addSuspension(Suspension suspension);

    void addStage(Stage stage);

    void addElectronics(Electronics electronics);

    Owner findByName(String ownerName);

    Car findByLicensePlate(String licensePlate);

    List findAllOwners();

    List findAllCars();

    void countOwners();

    void countInShopCars();






}
