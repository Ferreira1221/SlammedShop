package org.academiadecodigo.codezillas.services;


import org.academiadecodigo.codezillas.persistence.model.Client;

import java.util.List;

public interface ClientService {

    void addClient(String name, String email, String phone);
    Client getClientById(Integer id);
    List<Client> clientsList();
    void deleteClient(Integer id);

}
