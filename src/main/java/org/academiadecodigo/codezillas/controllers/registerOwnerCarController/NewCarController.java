package org.academiadecodigo.codezillas.controllers.registerOwnerCarController;

import org.academiadecodigo.codezillas.controllers.AbstractController;
import org.academiadecodigo.codezillas.controllers.Controller;
import org.academiadecodigo.codezillas.model.Car;
import org.academiadecodigo.codezillas.services.UserService;
import org.academiadecodigo.codezillas.utils.Messages;

import java.util.List;

public class NewCarController extends AbstractController {

    private Controller addCarController;
    private UserService userService;

    public void newCar(String licensePlate, String brand, String model, Integer hp) {

        if (licensePlateExists(licensePlate)) {
            System.out.println(Messages.LICENSE_PLATE_EXISTS);
            init();
        }

        userService.addCar(registerCar(licensePlate, brand, model, hp));
        addCarController.init();
    }

    public void setAddCarController(Controller addCarController) {
        this.addCarController = addCarController;
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
}
