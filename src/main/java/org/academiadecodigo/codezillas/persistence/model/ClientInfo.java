package org.academiadecodigo.codezillas.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "clientinfo")
public class ClientInfo extends AbstractModel{

    private String username;
    private String password;

    @OneToMany(
            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "clientInfo",

            fetch = FetchType.EAGER
    )

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
