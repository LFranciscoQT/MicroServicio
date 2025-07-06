package com.Francisco.escritores.escritor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}