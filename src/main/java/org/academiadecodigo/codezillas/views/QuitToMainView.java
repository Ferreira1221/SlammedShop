package org.academiadecodigo.codezillas.views;

import org.academiadecodigo.codezillas.controllers.QuitToMainController;

public class QuitToMainView extends AbstractView {

    private QuitToMainController quitToMainController;

    @Override
    public void show() {
        quitToMainController.quitToMain();
    }

    public void setQuitToMainController(QuitToMainController quitToMainController) {
        this.quitToMainController = quitToMainController;
    }
}
