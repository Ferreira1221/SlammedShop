package org.academiadecodigo.codezillas.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class CarDto {

    private Integer id;



    @NotNull(message = "License Plate is mandatory")
    @NotBlank(message = "License Plate is mandatory")
    @Size(min = 2, max = 8)
    private String licensePlate;

    @NotNull(message = "Brand is mandatory")
    @NotBlank(message = "Brand is mandatory")
    @Size(min = 2, max = 64)
    private String brand;

    @NotNull(message = "Model is mandatory")
    @NotBlank(message = "Model is mandatory")
    @Size(min = 2, max = 64)
    private String model;

    @NotNull(message = "HorsePower is mandatory")
    @NotBlank(message = "HorsePower is mandatory")
    @Size(min = 2, max = 4)
    private Integer horsePower;

    @NotNull(message = "Car year is mandatory")
    @NotBlank(message = "Car year mandatory")
    @Size(min = 2, max = 10)
    private Date carDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Date getCarDate() {
        return carDate;
    }

    public void setCarDate(Date carDate) {
        this.carDate = carDate;
    }
}
