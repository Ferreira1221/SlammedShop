package org.academiadecodigo.codezillas.persistence.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "inshopcars")
public class InShop extends AbstractModel {

    @OneToMany
    private List<Car> car = new ArrayList<>();

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}
