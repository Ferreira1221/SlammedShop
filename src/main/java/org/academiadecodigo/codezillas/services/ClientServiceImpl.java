package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.persistence.dao.ClientDao;
import org.academiadecodigo.codezillas.persistence.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao;

    @Transactional
    @Override
    public void addClient(String name, String email, String phone) {
        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setPhone(phone);

        clientDao.saveOrUpdate(client);
    }

    @Override
    public Client getClientById(Integer id) {
        return clientDao.findById(id);
    }

    @Override
    public List<Client> clientsList() {
        return clientDao.findAll();
    }

    @Override
    public void deleteClient(Integer id) {
        //TODO: implement method
    }

    @Autowired
    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }
}

