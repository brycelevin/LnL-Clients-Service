package com.nexient.lnl.clients.service;

import com.nexient.lnl.clients.domain.Client;
import com.nexient.lnl.clients.dto.ClientDTO;
import com.nexient.lnl.clients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientDTO> getClients() {
        List<Client> clientEntities = clientRepository.findAll();

        List<ClientDTO> clientDtos = new ArrayList<ClientDTO>();

        //Map these entities to DTOs
        if(clientEntities != null && clientEntities.size() > 0) {
            for(Client client : clientEntities) {
                ClientDTO clientDto = new ClientDTO();
                clientDto.setClientName(client.getName());
                clientDto.setClientId(client.getId());
                clientDtos.add(clientDto);
            }
        }

        return clientDtos;
    }

    public ClientDTO create(ClientDTO clientDto) {
        Client client = new Client();
        client.setName(clientDto.getClientName());
        Client createdClient = clientRepository.save(client);

        if(createdClient != null) {
            //Convert to DTO
            ClientDTO createdClientDto = new ClientDTO();
            createdClientDto.setClientId(createdClient.getId());
            createdClientDto.setClientName(createdClient.getName());
            return createdClientDto;
        }

        return null;
    }
}
