package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AccountService implements AccountServiceInt {

    private EntityManagerFactory emf;

    @Override
    public boolean authenticate(String username, String password) {


        return false;
    }

    @Override
    public void addUser(String username, String password) {

        EntityManager em = emf.createEntityManager();

        em.createNativeQuery("INSERT INTO ClientInfo(username)").setParameter(username, username);

        em.createNativeQuery("INSERT INTO ClientInfo(password)").setParameter(password, password);

        em.close();


    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public Account getAccount(String username, String password) {
        return null;
    }
}
