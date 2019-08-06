package org.academiadecodigo.codezillas.persistence.model.components;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "electronics")
public class Electronics {


    private String elecsDescription;

    @ManyToOne
    private ComponentsList componentsList;

    public String getElecsDescription() {
        return elecsDescription;
    }

    public void setElecsDescription(String elecsDescription) {
        this.elecsDescription = elecsDescription;
    }
}
