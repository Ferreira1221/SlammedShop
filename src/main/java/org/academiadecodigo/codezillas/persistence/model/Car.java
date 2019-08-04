package org.academiadecodigo.codezillas.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    @Id
    private String licensePlate;
    private String brand;
    private String model;
    private Integer horsePower;

    @ManyToOne
    private Client owner;

    @ManyToOne
    private InShop inShop;

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

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public InShop getInShop() {
        return inShop;
    }

    public void setInShop(InShop inShop) {
        this.inShop = inShop;
    }
}
