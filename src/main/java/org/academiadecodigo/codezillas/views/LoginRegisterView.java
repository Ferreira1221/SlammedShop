package org.academiadecodigo.codezillas.views;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.codezillas.controllers.LoginRegisterController;
import org.academiadecodigo.codezillas.utils.Messages;

public class LoginRegisterView extends AbstractView {

    private LoginRegisterController loginRegisterController;

    public void show() {
        showWelcomeMessage();
        loginRegister();
    }

    private void showWelcomeMessage() {
        System.out.println(Messages.WELCOME);
    }

    private void loginRegister() {
        MenuInputScanner scanner = new MenuInputScanner(Messages.WElCOME_OPTIONS);
        scanner.setMessage(Messages.SLAMMED_SHOP);

        loginRegisterController.loginRegisterQuit(prompt.getUserInput(scanner));
    }

    public void setLoginRegisterController(LoginRegisterController loginRegisterController) {
        this.loginRegisterController = loginRegisterController;
    }
}
