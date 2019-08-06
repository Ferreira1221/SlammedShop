package org.academiadecodigo.codezillas.persistence.model.components;

import org.academiadecodigo.codezillas.persistence.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tires")
public class Tires extends AbstractModel {

    private String brand;
    private String type;

    @ManyToOne
    private ComponentsList componentsList;

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ComponentsList getComponentsList() {
        return componentsList;
    }

    public void setComponentsList(ComponentsList componentsList) {
        this.componentsList = componentsList;
    }
}
