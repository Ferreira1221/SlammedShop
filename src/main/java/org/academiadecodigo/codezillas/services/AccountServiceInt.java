package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Account;

public interface AccountServiceInt {

    void addAccount(Account account);

    Account getAccount(String username, String password);
}
