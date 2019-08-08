package org.academiadecodigo.codezillas.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SuspensionDto {


    private Integer id;

    @NotNull(message = "Brand is mandatory")
    @NotBlank(message = "Brand is mandatory")
    @Size(min = 2, max = 64)
    private String brand;

    @NotNull(message = "Suspension type is mandatory")
    @NotBlank(message = "Suspension type is mandatory")
    @Size(min = 2, max = 64)
    private String type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


