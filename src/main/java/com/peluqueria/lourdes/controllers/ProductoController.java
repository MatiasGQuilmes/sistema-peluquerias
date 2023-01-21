package com.peluqueria.lourdes.controllers;


import com.peluqueria.lourdes.DTOS.ProductoDTO;
import com.peluqueria.lourdes.service.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {


    @Autowired
    ProductoServicio productoServicio;


    @GetMapping("/productos")
    public List<ProductoDTO> getProducts(){
        return productoServicio.listProductsDTO();
    }


    @GetMapping("/productos/{id}")
    public ProductoDTO getProducto(@PathVariable Long id){
        return productoServicio.productoDTO(id);
    }

}
