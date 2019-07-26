package org.academiadecodigo.codezillas.views.registerOwnerCarViews;

import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.codezillas.controllers.registerOwnerCarController.NewCarController;
import org.academiadecodigo.codezillas.utils.Messages;
import org.academiadecodigo.codezillas.views.AbstractView;

public class NewCarView extends AbstractView {

    private NewCarController newCarController;

    @Override
    public void show() {
        MenuInputScanner menuScanner = new MenuInputScanner(newCarController.registeredOwners());
        StringInputScanner scanner = new StringInputScanner();
        IntegerInputScanner intScaner = new IntegerInputScanner();

        menuScanner.setMessage(Messages.SELECT_OWNER);
        Integer selectedOwner = prompt.getUserInput(menuScanner);

        scanner.setMessage(Messages.NEW_CAR_LICENSE_PLATE);
        String licensePlate = prompt.getUserInput(scanner);

        scanner.setMessage(Messages.NEW_CAR_BRAND);
        String brand = prompt.getUserInput(scanner);

        scanner.setMessage(Messages.NEW_CAR_MODEL);
        String model = prompt.getUserInput(scanner);

        intScaner.setMessage(Messages.NEW_CAR_HP);
        Integer horsepower = prompt.getUserInput(intScaner);

        newCarController.newCar(licensePlate, brand, model, horsepower);
    }

    public void setNewCarController(NewCarController newCarController) {
        this.newCarController = newCarController;
    }
}
