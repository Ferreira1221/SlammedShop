package org.academiadecodigo.codezillas.persistence.dao;

import org.academiadecodigo.codezillas.persistence.model.User;

public interface UserDao extends Dao<User> {

    User findByLogin(String username, String password);

}
