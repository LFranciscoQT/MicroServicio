package com.Francisco.libros.libros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Francisco.libros.escritoresDTO.EscritoresDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/API")
@RequiredArgsConstructor

public class LibrosController 
{

   @Autowired
   private final LibrosService librosService;
   
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

   //Metodo Update
   @PutMapping(value = "/libro/{id}")
   public ResponseEntity<Libros> actualizarLibros(@PathVariable("id") Long id, @RequestBody Libros entity)
   {
      return librosService.actualizarLibros(id, entity);
   }

   //Controlar Escritores por Id desde Aqui
   @GetMapping("/consultar/escritor/{id}")
   public EscritoresDto obtenerEscritorMicro(@PathVariable("id") Long id)
   {
      return librosService.obternerEscritorById(id);
   }
}
