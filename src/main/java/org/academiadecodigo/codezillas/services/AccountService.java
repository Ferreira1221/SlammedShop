package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Account;

import javax.persistence.EntityManagerFactory;

public class AccountService implements AccountServiceInt {

    private EntityManagerFactory emf;

    @Override
    public boolean authenticate(String username, String password) {


        return false;
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public Account getAccount(String username, String password) {
        return null;
    }
}
