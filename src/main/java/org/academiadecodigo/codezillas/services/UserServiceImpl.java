package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.dao.UserDao;
import org.academiadecodigo.codezillas.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(Integer id) {
        /*User user = userDao.findById(id);
        user = null;
        userDao.saveOrUpdate(user);*/
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public User getUserByLogin(String username, String password) {
        return userDao.findByLogin(username, password);
    }

    @Override
    public List<User> userList() {
        return userDao.findAll();
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
