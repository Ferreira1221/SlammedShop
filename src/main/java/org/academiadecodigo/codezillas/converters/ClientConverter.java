package org.academiadecodigo.codezillas.converters;

import org.academiadecodigo.codezillas.command.ClientDto;
import org.academiadecodigo.codezillas.persistence.model.Client;
import org.academiadecodigo.codezillas.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientConverter {

    private ClientServiceImpl clientService;

    @Autowired
    public void setClientService(ClientServiceImpl clientService) {
        this.clientService = clientService;
    }

    public Client convertClientDtoToClient(ClientDto clientDto) {

        Client client = (clientDto.getId()) != null ? clientService.getClientById(clientDto.getId()) : new Client();

        client.setName(clientDto.getName());
        client.setEmail(clientDto.getEmail());
        client.setPhone(clientDto.getPhone());

        return client;
    }

    public ClientDto convertClientToClientDto(Client client) {

        ClientDto clientDto = new ClientDto();

        clientDto.setId(client.getId());
        clientDto.setName(client.getName());
        clientDto.setEmail(client.getEmail());
        clientDto.setPhone(client.getPhone());

        return clientDto;
    }
}
