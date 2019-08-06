package org.academiadecodigo.codezillas.controllers.registerOwnerCarController;

import org.academiadecodigo.codezillas.controllers.AbstractController;
import org.academiadecodigo.codezillas.controllers.Controller;
import org.academiadecodigo.codezillas.services.ClientServiceImpl;

public class RegisterOwnerCarController extends AbstractController {

    private Controller newCarController;
    private Controller newOwnerController;
    private Controller quitTomainMenu;
    private ClientServiceImpl userService;

    public void newRegist(int registOption) {
        switch (registOption) {
            case 1:
                newOwnerController.init();
                break;
            case 2:
                newCarController.init();
                break;
            case 3:
                quitTomainMenu.init();
                break;
        }
    }

    public void setNewCarController(Controller newCarController) {
        this.newCarController = newCarController;
    }

    public void setNewOwnerController(Controller newOwnerController) {
        this.newOwnerController = newOwnerController;
    }

    public void setQuitTomainMenu(Controller quitTomainMenu) {
        this.quitTomainMenu = quitTomainMenu;
    }

    public void setUserService(ClientServiceImpl userService) {
        this.userService = userService;
    }
}
