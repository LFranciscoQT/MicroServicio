package com.Francisco.escritores.escritor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/API")

public class EscritoresController 
{
    
    @Autowired
    private EscritoresService escritoresService;

    //Metodo Guardar
    @PostMapping(value ="/escritor")
    public Escritores save(@RequestBody Escritores entity)
    {
        return escritoresService.save(entity);
    }

    //Metodo Selct by Id
    @GetMapping(value = "/escritor/{id}")
    public Escritores findById(@PathVariable("id") Long id)
    {
        return escritoresService.findById(id);
    }
    
    //Metodo Borrar
    @DeleteMapping(value = "/escritor/{id}")
    public void deleteById(@PathVariable("id") Long id)
    {
        escritoresService.deleteById(id);
    }

    //metodo Select
    @GetMapping(value = "/escritor")
    public List<Escritores> findAll()
    {
        return escritoresService.findAll();
    }

    //Actualisar
}
