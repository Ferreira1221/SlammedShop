package org.academiadecodigo.codezillas.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ElectronicsDto {

    private Integer id;

    @NotNull(message = "Electronics description is mandatory")
    @NotBlank(message = "Electronics description is mandatory")
    @Size(min = 2, max = 64)
    private String elecsDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getElecsDescription() {
        return elecsDescription;
    }

    public void setElecsDescription(String elecsDescription) {
        this.elecsDescription = elecsDescription;
    }
}
