package org.academiadecodigo.codezillas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.List;
@Entity
public class Owner {


    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String registerDate;

    public Owner() {
    }

    @Id
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }
}
