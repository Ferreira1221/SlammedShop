package org.academiadecodigo.codezillas;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.codezillas.controllers.LoginController;
import org.academiadecodigo.codezillas.controllers.LoginRegisterController;
import org.academiadecodigo.codezillas.persistence.ConnectionManager;
import org.academiadecodigo.codezillas.services.UserService;
import org.academiadecodigo.codezillas.views.LoginRegisterView;
import org.academiadecodigo.codezillas.views.LoginView;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BootStrap {

    private Prompt prompt;

    public BootStrap() {
        prompt = new Prompt(System.in,System.out);
    }

    public void initBootStrap() {

        //hibernate
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aco");

        ConnectionManager connectionManager = new ConnectionManager();
        //UserService userService = new UserService(connectionManager.getConnection); //TODO: implement connectionManager

        // Instantiate Controller
        LoginRegisterController loginRegisterController = new LoginRegisterController();
        LoginController loginController = new LoginController();

        // Instantiate Views
        LoginRegisterView loginRegisterView = new LoginRegisterView();
        LoginView loginView = new LoginView();

        // Set Controllers
        loginRegisterController.setView(loginRegisterView);

        loginController.setView(loginView);
        loginController.setNextController(null);    //TODO:implement main controller

        // Set Views
        loginRegisterView.setPrompt(prompt);
        
        loginView.setPrompt(prompt);
        loginView.setController(loginController);


    }

}
