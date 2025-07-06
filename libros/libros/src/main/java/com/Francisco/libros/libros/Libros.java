package com.Francisco.libros.libros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long id; 
    private String Nombre;
    private String Escritor;
    private String Genero;
    private Boolean Rentado; 
}
