package org.academiadecodigo.codezillas.controllers.registerOwnerCarController;

import org.academiadecodigo.codezillas.controllers.AbstractController;
import org.academiadecodigo.codezillas.controllers.Controller;
import org.academiadecodigo.codezillas.persistence.model.Owner;
import org.academiadecodigo.codezillas.services.UserService;

public class NewOwnerController extends AbstractController {

    private Integer ownerId;
    private Controller nextController;
    private UserService userService;

    public void newOwner(String name, String email, String phone, String registerDate) {
        userService.addOwner(createOwnerFile(name, email, phone, registerDate));
        nextController.init();
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private Owner createOwnerFile(String name, String email, String phone, String registerDate) {
        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setName(name);
        owner.setEmail(email);
        owner.setPhone(phone);
        owner.setRegisterDate(registerDate);

        ownerId++;

        return owner;
    }
}
