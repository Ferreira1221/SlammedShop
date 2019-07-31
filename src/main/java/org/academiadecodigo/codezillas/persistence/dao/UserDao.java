package org.academiadecodigo.codezillas.persistence.dao;

import org.h2.engine.User;

import java.util.List;

public interface UserDao extends Dao<User> {

    List<Integer> getUserIds();

}
