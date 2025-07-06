package com.Francisco.libros.libros;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LibrosRepository extends CrudRepository<Libros, Long>
{
    List<Libros> findAll();
}