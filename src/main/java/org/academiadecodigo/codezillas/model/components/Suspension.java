package org.academiadecodigo.codezillas.model.components;

public class Suspension {

    private Integer id;
    private String brand;
    private String type;


    public Suspension() {
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }
}
