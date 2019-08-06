package org.academiadecodigo.codezillas.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
public class Client extends AbstractModel {

    private String name;
    private String email;
    private String phone;


    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "owner",

            fetch = FetchType.EAGER
    )
    private List<Car> carList = new ArrayList<>();



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
