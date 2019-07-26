package org.academiadecodigo.codezillas.views.registerOwnerCarViews;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.codezillas.controllers.registerOwnerCarController.NewOwnerController;
import org.academiadecodigo.codezillas.utils.Messages;
import org.academiadecodigo.codezillas.views.AbstractView;

public class NewOwnerView extends AbstractView {

    private NewOwnerController newOwnerController;

    @Override
    public void show() {
        StringInputScanner scanner = new StringInputScanner();

        scanner.setMessage(Messages.NEW_OWNER_NAME);
        String name = prompt.getUserInput(scanner);

        scanner.setMessage(Messages.NEW_OWNER_EMAIL);
        String email = prompt.getUserInput(scanner);

        scanner.setMessage(Messages.NEW_OWNER_PHONE);
        String phone = prompt.getUserInput(scanner);

        scanner.setMessage(Messages.NEW_REGISTER_DATE);
        String registerDate = prompt.getUserInput(scanner);

        newOwnerController.newOwner(name, email, phone, registerDate);
    }

    public void setNewOwnerController(NewOwnerController newOwnerController) {
        this.newOwnerController = newOwnerController;
    }
}
