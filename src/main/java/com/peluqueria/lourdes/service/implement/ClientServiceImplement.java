package com.peluqueria.lourdes.service.implement;

import com.peluqueria.lourdes.DTOS.ClienteDTO;
import com.peluqueria.lourdes.models.Cliente;
import com.peluqueria.lourdes.repositories.ClienteRepository;
import com.peluqueria.lourdes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImplement implements ClienteService {


    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> getClientsDTO() {
        return clienteRepository.findAll().stream().map(cliente -> new ClienteDTO(cliente)).collect(Collectors.toList());
    }

    @Override
    public ClienteDTO getClientDTO(Long id) {
        return clienteRepository.findById(id).map(ClienteDTO::new).orElse(null);
    }

    @Override
    public Cliente getClientByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }


}
