package com.Francisco.escritores.escritor;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Escritores 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long id;
    private String Nombre;
    private String Genero;
    private Integer Libros;
    private Year Nacimiento;
}
