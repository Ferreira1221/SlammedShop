package org.academiadecodigo.codezillas.persistence.model;

import org.academiadecodigo.codezillas.persistence.model.components.*;

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

    /*
    @ManyToOne
    private Client client;

    @OneToOne
    private Electronics electronics;

    @OneToOne
    private Stage stage;

    @OneToOne
    private Suspension suspension;

    @OneToOne
    private Tires tires;
    */

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

    /*
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public void setElectronics(Electronics electronics) {
        this.electronics = electronics;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }
    */

    enum CarStatus {

        WAITING,
        IN_PROGREES,
        READY,
        DELIVERED;

        CarStatus() {
        }
    }

}

