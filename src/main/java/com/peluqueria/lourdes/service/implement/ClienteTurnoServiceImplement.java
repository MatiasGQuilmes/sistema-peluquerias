package com.peluqueria.lourdes.service.implement;

import com.peluqueria.lourdes.DTOS.ClienteTurnoDTO;
import com.peluqueria.lourdes.repositories.ClienteTurnoRepository;
import com.peluqueria.lourdes.service.ClienteTurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteTurnoServiceImplement implements ClienteTurnoService {

    @Autowired
    ClienteTurnoRepository clienteTurnoRepository;


    @Override
    public List<ClienteTurnoDTO> getListClientTurnoDTO() {
        return clienteTurnoRepository.findAll().stream().map(clienteTurno -> new ClienteTurnoDTO(clienteTurno)).collect(Collectors.toList());
    }

    @Override
    public ClienteTurnoDTO getClienteTurno(Long id) {
        return clienteTurnoRepository.findById(id).map(clienteTurno -> new ClienteTurnoDTO(clienteTurno)).orElse(null);
    }
}
