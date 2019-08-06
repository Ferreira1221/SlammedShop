package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.model.User;

public interface AuthService {

    boolean authenticate(String username, String password);
    void register(String username, String password);
    User getAccessingUser();

}
