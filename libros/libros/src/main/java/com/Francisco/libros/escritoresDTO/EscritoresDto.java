package com.Francisco.libros.escritoresDTO;

import java.time.Year;

import lombok.Data;

@Data

public class EscritoresDto {
    
    private Long id;
    private String Nombre;
    private String Genero;
    private Integer Libros;
    private Year Nacimiento;
}
