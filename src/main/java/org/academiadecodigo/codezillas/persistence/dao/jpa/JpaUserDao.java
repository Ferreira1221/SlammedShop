package org.academiadecodigo.codezillas.persistence.dao.jpa;

import org.academiadecodigo.codezillas.persistence.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }

    public User findByLogin(String username, String password) {
        List<User> users = findAll();

        User user = null;

        for(User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                user = u;
            }
        }
        return user;
    }
}
