package org.academiadecodigo.codezillas.controllers;

public class LoginController extends AbstractController {

    private Controller nextController;
    private boolean authFailed;

    public void onLogin(String username, String password) {

        if (!userServiceInt.authenticate(username,password)) {
            authFailed = true;
            init();
            return;
        }

        nextController.init();
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    public boolean isAuthFailed() {
        return authFailed;
    }
}
