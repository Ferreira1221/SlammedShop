package org.academiadecodigo.codezillas.controllers;

import org.academiadecodigo.codezillas.model.Account;
import org.academiadecodigo.codezillas.services.AccountService;
import org.academiadecodigo.codezillas.services.AccountServiceInt;

public class RegisterController extends AbstractController {

    private Controller nextController;
    private AccountServiceInt accountService;

    public void accountExists(String username, String password) {
        if (accountService.getAccount(username, password) != null) {
            init();
        }
        accountService.addAccount(new Account());
        //TODO: Account must receive username and password as arguments
        nextController.init();
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }
}
