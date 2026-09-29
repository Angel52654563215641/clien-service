package com.client_service.controller;

import com.client_service.dto.ClientDto;
import com.client_service.model.Client;
import com.client_service.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@Valid @RequestBody ClientDto clientDto) {

        Client client = clientService.createClient(clientDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }
}