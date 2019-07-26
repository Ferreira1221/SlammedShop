package org.academiadecodigo.codezillas.model.components;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stage {

    @Id
    private Integer id;
    private String stage_Type;

    public Integer getId() {
        return id;
    }

    public String getStage_Type() {
        return stage_Type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStage_Type(String stage_Type) {
        this.stage_Type = stage_Type;
    }
}
