package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.TransactionManager;
import org.academiadecodigo.codezillas.persistence.dao.AccountDao;
import org.academiadecodigo.codezillas.persistence.model.Account;
import org.academiadecodigo.codezillas.persistence.model.Owner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AccountService implements AccountServiceInt {

    private AccountDao accountDao;
    private TransactionManager tx;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTx(TransactionManager tx) {
        this.tx = tx;
    }

    @Override
    public boolean authenticate(String username, String password) {


        return false;
    }

    @Override
    public void addUser(String username, String password) {


    }

    @Override
    public void addAccount(Account account) {


    }

    @Override
    public Account getAccount(String username, String password) {

        return null;
    }

    //TODO: refactor this class methods
}
