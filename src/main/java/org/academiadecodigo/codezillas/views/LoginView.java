package org.academiadecodigo.codezillas.views;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.codezillas.controllers.LoginController;
import org.academiadecodigo.codezillas.utils.Messages;

public class LoginView extends AbstractView {

    private LoginController controller;

    public void show() {

        if (controller.isAuthFailed()) {
            System.out.println(Messages.LOGIN_ERROR);
        }

        showLoginPrompt();
    }

    private void showLoginPrompt() {
        StringInputScanner scanner = new StringInputScanner();

        scanner.setMessage(Messages.LOGIN_USERNAME);
        String username = prompt.getUserInput(scanner);

        scanner.setMessage(Messages.LOGIN_PASSWORD);
        String password = prompt.getUserInput(scanner);

        controller.onLogin(username, password);
    }

    public void setController(LoginController controller) {
        this.controller = controller;
    }
}
