package org.academiadecodigo.codezillas.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "carlist")
public class CarsList extends AbstractModel {

    private Integer ownerId;
    private String carBrand;
    private String carModel;
    private String carLicensePlate;

    @OneToMany(

            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "carList",

            fetch = FetchType.EAGER
    )

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }
}
