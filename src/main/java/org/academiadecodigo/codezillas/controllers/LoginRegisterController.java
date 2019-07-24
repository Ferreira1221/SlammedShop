package org.academiadecodigo.codezillas.controllers;

public class LoginRegisterController extends AbstractController {

    private Controller nextController;
    private boolean authFailed;

    public void loginRegisterQuit(int selectedOption) {
        switch (selectedOption) {
            case 1:

        }
    }

    public boolean isAuthFailed() {
        return authFailed;
    }
}
