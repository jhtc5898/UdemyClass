package com.formacionbdi.springboot.app.productos.models.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {


    private static final long serialVersionUID = -2543400907796395728L;//se debe definir como serializable ya que me permite enviar este objeto como bytes mediante un http

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Crea una llave de forma automatica
    private Long id ;
    private String nombre;
    private Double precio;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)//permite saber en que formato vamos a guardar el date
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", createAt=" + createAt +
                '}';
    }
}
