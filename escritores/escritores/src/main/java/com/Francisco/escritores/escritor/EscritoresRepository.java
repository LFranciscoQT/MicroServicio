package com.Francisco.escritores.escritor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EscritoresRepository extends CrudRepository<Escritores, Long> 
{
    List<Escritores> findAll();
}
