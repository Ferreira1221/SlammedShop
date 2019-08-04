package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.TransactionManager;
import org.academiadecodigo.codezillas.persistence.dao.AccountDao;

public class AccountService implements AccountServiceInt {

    private AccountDao accountDao;
    private TransactionManager tx;

}
