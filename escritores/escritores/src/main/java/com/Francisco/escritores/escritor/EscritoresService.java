package com.Francisco.escritores.escritor;

import java.util.List;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class EscritoresService 
{
    
    @Autowired
    private EscritoresRepository escritoresRepository;

    //Guardar
    public Escritores save(Escritores entity)
    {
        return escritoresRepository.save(entity);
    }

    //Select by Id
    public Escritores findById(Long id)
    {
        return escritoresRepository.findById(id).orElse(null);
    }

    //Borrar
    public void deleteById(Long id)
    {
        escritoresRepository.deleteById(id);
    }

    //Select
    public List<Escritores> findAll()
    {
        return escritoresRepository.findAll();
    }

    //Actualizar Parcial
    public ResponseEntity<Escritores> actualizarEscritores(Long id, Escritores entityActualizada)
    {
        try
        {
            //Verificar si el id existe

            Escritores escritorExistente = findById(id);

            if (escritorExistente == null)
            {
                return ResponseEntity.notFound().build();
            }

            //Actualizar los campos correspondientes

            //nombre
            if (entityActualizada.getNombre()!=null) 
            {
                escritorExistente.setNombre(entityActualizada.getNombre());
            }
            //Genero
            if (entityActualizada.getGenero()!=null) 
            {
                escritorExistente.setGenero(entityActualizada.getGenero());    
            }
            //Libros
            if (entityActualizada.getLibros()!=null) 
            {
                escritorExistente.setLibros(entityActualizada.getLibros());    
            }
            //Nacimiento
            if (entityActualizada.getNacimiento()!=null) 
            {
                escritorExistente.setNacimiento(entityActualizada.getNacimiento());    
            }

            //Guardar Cambios

            Escritores escritoresGuardados = save(escritorExistente);

            return ResponseEntity.ok(escritoresGuardados);

        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.SC_INTERNAL_SERVER_ERROR).build();
        }
    }
}