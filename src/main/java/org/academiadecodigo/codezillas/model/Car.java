package org.academiadecodigo.codezillas.model;

public class Car {

    private String licensePlate;
    private String brand;
    private String model;
    private Integer horsePower;


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
}
