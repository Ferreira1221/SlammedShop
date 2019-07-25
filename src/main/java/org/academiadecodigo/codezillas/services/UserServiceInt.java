package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Car;
import org.academiadecodigo.codezillas.model.Owner;
import org.academiadecodigo.codezillas.model.components.Electronics;
import org.academiadecodigo.codezillas.model.components.Stage;
import org.academiadecodigo.codezillas.model.components.Suspension;
import org.academiadecodigo.codezillas.model.components.Tires;

public interface UserServiceInt {

    boolean authenticate(String username, String password);


    void addOwner(Owner owner);

    void addCar(Car car);

    void addTire(Tires tire);

    void addSuspension(Suspension suspension);

    void addStage(Stage stage);

    void addElectronics(Electronics electronics);

    void findByName(String ownerName);

    void findByLicensePlate(String licensePlate);

    void findAll();

    void countOwners();

    void countInShopCars();

}
