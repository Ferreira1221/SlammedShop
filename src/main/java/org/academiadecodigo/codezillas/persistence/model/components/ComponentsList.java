package org.academiadecodigo.codezillas.persistence.model.components;

import org.academiadecodigo.codezillas.persistence.model.AbstractModel;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class ComponentsList extends AbstractModel {


    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "componentsList",

            fetch = FetchType.EAGER
    )
    private List<Tires> tires = new ArrayList<>();

    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "componentsList",

            fetch = FetchType.EAGER
    )
    private List<Suspension> suspension = new ArrayList<>();

    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "componentsList",

            fetch = FetchType.EAGER
    )
    private List<Stage> stage = new ArrayList<>();

    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "componentsList",

            fetch = FetchType.EAGER
    )
    private List<Electronics> electronics = new ArrayList<>();


    public List<Tires> getTires() {
        return tires;
    }

    public void setTires(List<Tires> tires) {
        this.tires = tires;
    }

    public List<Suspension> getSuspension() {
        return suspension;
    }

    public void setSuspension(List<Suspension> suspension) {
        this.suspension = suspension;
    }

    public List<Stage> getStage() {
        return stage;
    }

    public void setStage(List<Stage> stage) {
        this.stage = stage;
    }

    public List<Electronics> getElectronics() {
        return electronics;
    }

    public void setElectronics(List<Electronics> electronics) {
        this.electronics = electronics;
    }
}
