package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Account;

public interface AccountServiceInt {

    boolean authenticate(String username, String password );

    void addAccount(Account account);

    Account getAccount(String username, String password);

    void addUser(String username, String password);
}
