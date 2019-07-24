package org.academiadecodigo.codezillas.controllers;

import org.academiadecodigo.codezillas.services.UserServiceInt;
import org.academiadecodigo.codezillas.views.View;

public abstract class AbstractController implements Controller {

    protected UserServiceInt userServiceInt;
    protected View view;

    public void init() {

    }

    public void setUserServiceInt(UserServiceInt userService) {
        this.userServiceInt = userService;
    }

    public void setView(View view) {
        this.view = view;
    }
}
