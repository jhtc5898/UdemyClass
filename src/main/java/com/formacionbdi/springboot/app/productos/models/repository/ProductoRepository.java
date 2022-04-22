package com.formacionbdi.springboot.app.productos.models.repository;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductoRepository extends CrudRepository<Producto,Long> {


}
