package org.academiadecodigo.codezillas.persistence.model;

import org.academiadecodigo.codezillas.persistence.model.components.ComponentsList;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends AbstractModel {

    private String licensePlate;
    private String brand;
    private String model;
    private Integer horsePower;

    @ManyToOne
    private Client client;

    @OneToOne
    private ComponentsList componentsList;

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ComponentsList getComponentsList() {
        return componentsList;
    }

    public void setComponentsList(ComponentsList componentsList) {
        this.componentsList = componentsList;
    }

    enum CarStatus {

        WAITING,
        IN_PROGREES,
        READY,
        DELIVERED;

        CarStatus() {
        }
    }

}

