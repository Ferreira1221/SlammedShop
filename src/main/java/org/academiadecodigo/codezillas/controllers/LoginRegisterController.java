package org.academiadecodigo.codezillas.controllers;

public class LoginRegisterController extends AbstractController {

    private Controller loginController;
    private Controller registerControler;
    private Controller quitController;
    private boolean authFailed;

    public void loginRegisterQuit(int selectedOption) {
        switch (selectedOption) {
            case 1:
                loginController.init();
                break;
            case 2:
                registerControler.init();
                break;
            case 3:
                quitController.init();
                break;
        }
    }

    public void setLoginController(Controller loginController) {
        this.loginController = loginController;
    }

    public void setRegisterControler(Controller registerControler) {
        this.registerControler = registerControler;
    }

    public void setQuitController(Controller quitController) {
        this.quitController = quitController;
    }

    public boolean isAuthFailed() {
        return authFailed;
    }
}
