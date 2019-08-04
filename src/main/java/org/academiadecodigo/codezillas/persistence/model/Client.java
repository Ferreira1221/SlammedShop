package org.academiadecodigo.codezillas.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "owner",

            fetch = FetchType.EAGER
    )
    private List<Account> account = new ArrayList<>();

    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "owner",

            fetch = FetchType.EAGER
    )
    private List<Car> car = new ArrayList<>();


    @Id
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String registerDate;


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

    /*
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    */

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }
}
