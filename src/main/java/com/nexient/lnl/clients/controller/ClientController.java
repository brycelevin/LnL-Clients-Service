package com.nexient.lnl.clients.controller;

import com.nexient.lnl.clients.dto.ClientDTO;
import com.nexient.lnl.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/Client", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientDTO> getClients() {
        return clientService.getClients();
    }

    @RequestMapping(value = "/Client", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ClientDTO createClient(@Valid @RequestBody ClientDTO clientDto) {
        return clientService.create(clientDto);
    }
}
