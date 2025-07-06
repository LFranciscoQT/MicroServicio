package com.Francisco.libros.libros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}