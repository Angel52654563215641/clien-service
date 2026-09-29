package com.client_service.service;

import com.client_service.dto.ClientDto;
import com.client_service.model.Client;
import com.client_service.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(ClientDto clientDto) {

        Client client = new Client();

        client.setFullName(clientDto.getFullName());
        client.setEmail(clientDto.getEmail());
        client.setPhone(clientDto.getPhone());

        return clientRepository.save(client);
    }
}