package org.academiadecodigo.codezillas.factories;

import org.academiadecodigo.codezillas.persistence.model.User;

public class UserFactory {

    //TODO: implementh design pattern factory

    public User createAccount() {

        return new User();
    }

}
