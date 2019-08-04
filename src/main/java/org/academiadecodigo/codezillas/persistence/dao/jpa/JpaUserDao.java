package org.academiadecodigo.codezillas.persistence.dao.jpa;

import org.academiadecodigo.codezillas.persistence.dao.UserDao;
import org.academiadecodigo.codezillas.persistence.model.Client;

public class JpaUserDao extends GenericJpaDao<Client> implements UserDao {

    public JpaUserDao() {
        super(Client.class);
    }

}
