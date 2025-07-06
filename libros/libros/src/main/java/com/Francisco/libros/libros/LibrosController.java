package com.Francisco.libros.libros;

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

public class LibrosController 
{

   @Autowired
   private LibrosService librosService;
   
   //Metodo Guardar
   @PostMapping(value = "/libro")
   public Libros save(@RequestBody Libros entity)
   {
    return librosService.save(entity);
   }

   //Metodo Selct By Id
   @GetMapping(value = "/libro/{id}")
   public Libros findById(@PathVariable("id") Long id)
   {
      return librosService.findById(id);
   }

   //Metodo Borrar
   @DeleteMapping(value = "/libro/{id}")
   public void deleteById(@PathVariable("id") Long id)
   {
      librosService.deleteById(id);
   }

   //Metodo Select
   @GetMapping(value = "/libro")
   public List<Libros> findAll()
   {
      return librosService.findAll();
   }
}
