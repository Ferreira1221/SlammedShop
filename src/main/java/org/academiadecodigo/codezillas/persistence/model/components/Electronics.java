package org.academiadecodigo.codezillas.persistence.model.components;

import org.academiadecodigo.codezillas.persistence.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "electronics")
public class Electronics extends AbstractModel {


    private String elecsDescription;

    @ManyToOne
    private ComponentsList componentsList;

    public String getElecsDescription() {
        return elecsDescription;
    }

    public void setElecsDescription(String elecsDescription) {
        this.elecsDescription = elecsDescription;
    }

    public ComponentsList getComponentsList() {
        return componentsList;
    }

    public void setComponentsList(ComponentsList componentsList) {
        this.componentsList = componentsList;
    }


}
