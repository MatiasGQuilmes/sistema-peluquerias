package com.peluqueria.lourdes.controllers;

import com.peluqueria.lourdes.DTOS.SucursalDTO;
import com.peluqueria.lourdes.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SucursalController {


    @Autowired
    SucursalService sucursalService;


    @GetMapping("/sucursal")
    public List<SucursalDTO> listSucursalesDTO(){
        return sucursalService.getSucursales();
    }

    @GetMapping("/sucursal/{id}")
    public SucursalDTO getSucursal(@PathVariable Long id){
        return sucursalService.getSucursal(id);
    }



}
