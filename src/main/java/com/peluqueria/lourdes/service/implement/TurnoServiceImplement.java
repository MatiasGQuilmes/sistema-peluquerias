package com.peluqueria.lourdes.service.implement;

import com.peluqueria.lourdes.DTOS.TurnoDTO;
import com.peluqueria.lourdes.models.Turno;
import com.peluqueria.lourdes.repositories.TurnoRepository;
import com.peluqueria.lourdes.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TurnoServiceImplement implements TurnoService {


    @Autowired
    TurnoRepository turnoRepository;


    @Override
    public List<TurnoDTO> getTurnos() {
        return turnoRepository.findAll().stream().map(turno -> new TurnoDTO(turno)).collect(Collectors.toList());
    }

    @Override
    public TurnoDTO getTurno(Long id) {
        return turnoRepository.findById(id).map(turno -> new TurnoDTO(turno)).orElse(null);
    }
}
