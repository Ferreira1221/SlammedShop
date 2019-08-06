package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User getUserById(Integer id);
    User getUserByLogin(String username, String passwird);
    List<User> userList();
    void deleteUser(Integer id);

}
