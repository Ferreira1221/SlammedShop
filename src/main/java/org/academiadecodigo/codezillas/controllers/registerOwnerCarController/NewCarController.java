package org.academiadecodigo.codezillas.controllers.registerOwnerCarController;

import org.academiadecodigo.codezillas.controllers.AbstractController;
import org.academiadecodigo.codezillas.controllers.Controller;
import org.academiadecodigo.codezillas.model.Car;
import org.academiadecodigo.codezillas.model.Owner;
import org.academiadecodigo.codezillas.services.UserService;
import org.academiadecodigo.codezillas.utils.Messages;

import java.util.List;

public class NewCarController extends AbstractController {

    private Controller mainController;
    private UserService userService;
    private String[] registeredOwners;

    public String[] registeredOwners() {
        List<Owner> ownerList = userService.findAllOwners();

        registeredOwners = new String[ownerList.size()];
        int index = 0;

        for (Owner owner : ownerList) {
            registeredOwners[index] = owner.getName();
            index++;
        }

        return registeredOwners;
    }

    public void addCarToOwner(int selectedOwner, String licensePlate, String brand, String model, Integer hp) {
        String ownerName = registeredOwners[selectedOwner - 1];

        Owner owner = userService.findByName(ownerName);

        Integer ownerId = owner.getId();

        newCar(ownerId, licensePlate, brand, model, hp);
    }

    public void setMainController(Controller addCarController) {
        this.mainController = addCarController;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private Car registerCar(String licensePlate, String brand, String model, Integer hp) {
        Car car = new Car();
        car.setLicensePlate(licensePlate);
        car.setBrand(brand);
        car.setModel(model);
        car.setHorsePower(hp);

        return car;
    }

    private boolean licensePlateExists(String licensePlate) {
        List<Car> carList = userService.findAllCars();

        for (Car car : carList) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return true;
            }
        }
        return false;
    }

    private void newCar(Integer ownerId, String licensePlate, String brand, String model, Integer hp) {

        if (licensePlateExists(licensePlate)) {
            System.out.println(Messages.LICENSE_PLATE_EXISTS);
            init();
        }

        userService.addCar(ownerId, registerCar(licensePlate, brand, model, hp));
    }
}
