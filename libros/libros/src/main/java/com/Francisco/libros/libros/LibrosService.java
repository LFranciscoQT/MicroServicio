package com.Francisco.libros.libros;

import java.util.List;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class LibrosService 
{

    @Autowired
    private LibrosRepository librosRepository;

    //Guardar
    public Libros save(Libros entity)
    {
        return librosRepository.save(entity);
    }

    //Select By Id
    public Libros findById(Long id)
    {
        return librosRepository.findById(id).orElse(null);
    }

    //Borrar
    public void deleteById(Long id)
    {
        librosRepository.deleteById(id);
    }

    //Select
    public List<Libros> findAll()
    {
        return librosRepository.findAll();
    }

    //Actualizar parcialmente
    public ResponseEntity<Libros> actualizarLibros(Long id, Libros entityActualizada)
    {
        try
        {
            //verificar si el Id existe

            Libros librosExistente = findById(id);
            
            if (librosExistente == null) 
            {
                return ResponseEntity.notFound().build();    
            }

            //Actualizar los campos correspondientes

            //Nombre
            if (entityActualizada.getNombre()!=null) 
            {
                librosExistente.setNombre(entityActualizada.getNombre());    
            }
            //Escritor
            if (entityActualizada.getEscritor()!=null) 
            {
                librosExistente.setEscritor(entityActualizada.getEscritor());    
            }
            //Genero
            if (entityActualizada.getGenero()!=null) 
            {
                librosExistente.setGenero(entityActualizada.getGenero());    
            }
            //Rentado
            if (entityActualizada.getRentado()!=null) 
            {
                librosExistente.setRentado(entityActualizada.getRentado());    
            }

            //Guardar Cambios

            Libros librosGuardados = save(librosExistente);

            return ResponseEntity.ok(librosGuardados);

        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.SC_INTERNAL_SERVER_ERROR).build();
        }
    }
}