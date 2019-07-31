package org.academiadecodigo.codezillas.persistence.dao.jpa;

import org.academiadecodigo.codezillas.persistence.dao.UserDao;
import org.h2.engine.User;
import org.hibernate.HibernateException;

import java.util.List;

public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }

    public List<Integer> getUserIds() {

        //TODO: implement getUserIds
        //return em.createQuery("select id from Customer", Integer.class).getResultList();
        return null;
    }

}
