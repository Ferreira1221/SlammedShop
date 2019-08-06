package org.academiadecodigo.codezillas.persistence.model.components;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stage")
public class Stage {

    private String stage_Type;

    @ManyToOne
    private ComponentsList componentsList;

    public String getStage_Type() {
        return stage_Type;
    }


    public void setStage_Type(String stage_Type) {
        this.stage_Type = stage_Type;
    }
}
