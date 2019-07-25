package org.academiadecodigo.codezillas.views.registerOwnerCarViews;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.codezillas.controllers.registerOwnerCarController.RegisterOwnerCarController;
import org.academiadecodigo.codezillas.utils.Messages;
import org.academiadecodigo.codezillas.views.AbstractView;

public class RegisterOwnerCarView extends AbstractView {

    private RegisterOwnerCarController registerOwnerCarController;

    @Override
    public void show() {
        MenuInputScanner scanner = new MenuInputScanner(Messages.REGISTER_CAR_OWNER_OPTIONS);

        scanner.setMessage(Messages.REGISTER_CAR_OWNER);

        registerOwnerCarController.newRegist(prompt.getUserInput(scanner));
    }

    public void setRegisterOwnerCarController(RegisterOwnerCarController registerOwnerCarController) {
        this.registerOwnerCarController = registerOwnerCarController;
    }
}
