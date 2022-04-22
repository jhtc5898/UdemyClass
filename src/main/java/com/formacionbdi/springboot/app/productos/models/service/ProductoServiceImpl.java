package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements  IProductoService{
    @Autowired
    private ProductoRepository productoRepository;


    @Transactional
    public List<Producto> findAll(){
        return (List<Producto>) productoRepository.findAll();
    }

    @Transactional
    public Producto findAllById(Long id){
        return productoRepository.findById(id).orElse(null);//El orElse es nos permite validar si el producto no se encuentra entonces que deveria retornar.

    }


}
