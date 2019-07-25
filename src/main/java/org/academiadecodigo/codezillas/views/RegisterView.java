package org.academiadecodigo.codezillas.views;

import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.codezillas.controllers.RegisterController;
import org.academiadecodigo.codezillas.utils.Messages;

public class RegisterView extends AbstractView {

    private RegisterController registerController;

    @Override
    public void show() {
        StringInputScanner scanner = new StringInputScanner();
        PasswordInputScanner passScanner = new PasswordInputScanner();

        scanner.setMessage(Messages.REGISTER_USERNAME);
        String username = prompt.getUserInput(scanner);

        passScanner.setMessage(Messages.REGISTER_PASSWORD);
        String password = prompt.getUserInput(passScanner);

        registerController.accountExists(username, password);
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }
}
