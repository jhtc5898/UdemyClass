package com.formacionbdi.springboot.app.productos.controllers;


import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductoService;
import com.formacionbdi.springboot.app.productos.models.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private ProductoServiceImpl productoServiceImpl;

    @GetMapping("/listar")
    public List<Producto> listar (){
        return productoServiceImpl.findAll();
    }

    @GetMapping("/producto/{id}")
    public Producto get_productoId(@PathVariable long id){
            return productoServiceImpl.findAllById(id);
    }


}
