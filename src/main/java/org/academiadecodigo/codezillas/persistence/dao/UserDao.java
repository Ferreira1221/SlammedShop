package org.academiadecodigo.codezillas.persistence.dao;

public interface UserDao extends Dao<User> {

    User findByLogin(String username, String password);

}
