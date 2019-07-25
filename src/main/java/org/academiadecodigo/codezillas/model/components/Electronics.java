package org.academiadecodigo.codezillas.model.components;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Electronics {

    private Integer id;
    private String elecsDescription;

    public Electronics() {
    }

    @Id
    public Integer getId() {
        return id;
    }

    public String getElecsDescription() {
        return elecsDescription;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setElecsDescription(String elecsDescription) {
        this.elecsDescription = elecsDescription;
    }
}
