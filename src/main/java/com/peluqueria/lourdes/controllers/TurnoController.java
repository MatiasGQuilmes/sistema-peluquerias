package com.peluqueria.lourdes.controllers;

import com.peluqueria.lourdes.DTOS.TurnoDTO;
import com.peluqueria.lourdes.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TurnoController {

    @Autowired
    TurnoService turnoService;


    @GetMapping("/turno")
    public List<TurnoDTO> getTurnos(){
        return turnoService.getTurnos();
    }

    @GetMapping("/turno/{id}")
    public TurnoDTO getTurno(@PathVariable Long id){
        return turnoService.getTurno(id);
    }


}
