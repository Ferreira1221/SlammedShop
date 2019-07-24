package org.academiadecodigo.codezillas;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.codezillas.controllers.LoginRegisterController;
import org.academiadecodigo.codezillas.views.LoginRegisterView;

public class BootStrap {

    private Prompt prompt;

    public BootStrap() {
        prompt = new Prompt(System.in,System.out);
    }

    public void initBootStrap() {

        // Instantiate Controller
        LoginRegisterController loginRegisterController = new LoginRegisterController();

        // Instantiate Views
        LoginRegisterView loginRegisterView = new LoginRegisterView();

        // Set Controllers
        loginRegisterController.setView(loginRegisterView);

        // Set Views
        loginRegisterView.setPrompt(prompt);
    }

}
