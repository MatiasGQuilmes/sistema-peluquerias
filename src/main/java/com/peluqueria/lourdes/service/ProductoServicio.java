package com.peluqueria.lourdes.service;

import com.peluqueria.lourdes.DTOS.ProductoDTO;

import java.util.List;

public interface ProductoServicio {

    List<ProductoDTO> listProductsDTO();

    ProductoDTO productoDTO(Long id);



}
