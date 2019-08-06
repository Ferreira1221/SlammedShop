package org.academiadecodigo.codezillas.controllers;

import org.academiadecodigo.codezillas.services.ClientService;
import org.academiadecodigo.codezillas.views.View;

public abstract class AbstractController implements Controller {

    protected ClientService userServiceInt;
    protected View view;

    public void init() {
        view.show();
    }

    public void setUserServiceInt(ClientService userService) {
        this.userServiceInt = userService;
    }

    public void setView(View view) {
        this.view = view;
    }
}
