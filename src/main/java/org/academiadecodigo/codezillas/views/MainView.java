package org.academiadecodigo.codezillas.views;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.codezillas.controllers.MainController;
import org.academiadecodigo.codezillas.utils.Messages;

public class MainView extends AbstractView {

    private MainController mainController;

    @Override
    public void show() {
        MenuInputScanner scanner = new MenuInputScanner(Messages.MAIN_MENU_OPTIONS);

        scanner.setMessage(Messages.MAIN_MENU);

        mainController.mainMenuOption(prompt.getUserInput(scanner));
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
