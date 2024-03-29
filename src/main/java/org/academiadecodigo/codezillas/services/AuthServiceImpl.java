package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private Integer accessingUserId;
    private UserService userService;

    @Override
    public boolean authenticate(String username, String password) {
        User loggingUser = userService.getUserByLogin(username, password);

        if (loggingUser != null) {
            accessingUserId = loggingUser.getId();
            return true;
        }
        return false;
    }

    @Override
    public void register(String username, String password) {
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);

        userService.addUser(user);
    }

    @Override
    public User getAccessingUser() {
        return userService.getUserById(accessingUserId);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
