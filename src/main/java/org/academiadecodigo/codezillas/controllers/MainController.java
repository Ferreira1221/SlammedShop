package org.academiadecodigo.codezillas.controllers;

import org.academiadecodigo.codezillas.controllers.inShopControllers.InShopController;
import org.academiadecodigo.codezillas.controllers.ownerCarController.SelectCarController;
import org.academiadecodigo.codezillas.controllers.registerOwnerCarController.RegisterOwnerCarController;
import org.academiadecodigo.codezillas.controllers.stockControllers.StockController;

public class MainController extends AbstractController {

    private InShopController inShopController;
    private SelectCarController selectCarController;
    private RegisterOwnerCarController registerOwnerCarController;
    private StockController stockController;
    private LoginRegisterController loginRegisterController;

    public void mainMenuOption(int menuOption) {
        switch (menuOption) {
            case 1:
                inShopController.init();
                break;
            case 2:
                selectCarController.init();
                break;
            case 3:
                stockController.init();
                break;
            case 4:
                registerOwnerCarController.init();
                break;
            case 5:
                loginRegisterController.init();
                break;
        }
    }

    public void setInShopController(InShopController inShopController) {
        this.inShopController = inShopController;
    }

    public void setSelectCarController(SelectCarController selectCarController) {
        this.selectCarController = selectCarController;
    }

    public void setRegisterOwnerCarController(RegisterOwnerCarController registerOwnerCarController) {
        this.registerOwnerCarController = registerOwnerCarController;
    }

    public void setStockController(StockController stockController) {
        this.stockController = stockController;
    }

    public void setLoginRegisterController(LoginRegisterController loginRegisterController) {
        this.loginRegisterController = loginRegisterController;
    }
}
