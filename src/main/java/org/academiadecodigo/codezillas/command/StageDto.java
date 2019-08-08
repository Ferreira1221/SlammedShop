package org.academiadecodigo.codezillas.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StageDto {

    private Integer id;

    @NotNull(message = "Stage type is mandatory")
    @NotBlank(message = "Stage type is mandatory")
    @Size(min = 2, max = 64)
    private String stage_Type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStage_Type() {
        return stage_Type;
    }

    public void setStage_Type(String stage_Type) {
        this.stage_Type = stage_Type;
    }
}
