package org.academiadecodigo.codezillas.controllers.registerOwnerCarController;

import org.academiadecodigo.codezillas.controllers.AbstractController;
import org.academiadecodigo.codezillas.controllers.Controller;
import org.academiadecodigo.codezillas.services.UserService;

public class RegisterOwnerCarController extends AbstractController {

    private Controller newCarController;
    private Controller newOwnerController;
    private UserService userService;

    public void newRegist(int registOption) {
        switch (registOption) {
            case 1:
                newOwnerController.init();
                break;
            case 2:
                newCarController.init();
                break;
        }
    }

    public void setNewCarController(Controller newCarController) {
        this.newCarController = newCarController;
    }

    public void setNewOwnerController(Controller newOwnerController) {
        this.newOwnerController = newOwnerController;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
