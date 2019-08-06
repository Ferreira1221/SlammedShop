package org.academiadecodigo.codezillas.services;

public interface AuthService {

    boolean authenticate(String username, String password);
    void register(String username, String password);
    User getAccessingUser();

}
