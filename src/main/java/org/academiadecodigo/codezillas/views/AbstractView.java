package org.academiadecodigo.codezillas.views;

import org.academiadecodigo.bootcamp.Prompt;

public abstract class AbstractView implements View {

    protected Prompt prompt;

    @Override
    public void show() {

    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }
}
