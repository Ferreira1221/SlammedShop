package org.academiadecodigo.codezillas.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InShop {

    private String car;
    private String owner;

    @Id

    public String getCar() {
        return car;
    }

    public String getOwner() {
        return owner;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
