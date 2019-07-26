package org.academiadecodigo.codezillas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InShop {

    @Id
    private String car;
    private String owner;

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
