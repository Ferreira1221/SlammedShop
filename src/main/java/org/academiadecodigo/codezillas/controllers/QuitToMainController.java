package org.academiadecodigo.codezillas.controllers;

public class QuitToMainController extends AbstractController {

    private Controller mainController;

    public void quitToMain() {
        mainController.init();
    }

    public void setMainController(Controller mainController) {
        this.mainController = mainController;
    }
}
