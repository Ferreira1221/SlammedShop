package org.academiadecodigo.codezillas.persistence.model.components;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "electronics")
public class Electronics {



    @Id
    private Integer id;
    private String elecsDescription;

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
