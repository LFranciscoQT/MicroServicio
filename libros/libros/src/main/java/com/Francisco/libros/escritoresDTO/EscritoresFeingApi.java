package com.Francisco.libros.escritoresDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "escritores")

public interface EscritoresFeingApi {

    @GetMapping("/API/escritor/{id}")
    EscritoresDto getEscritoreById(@PathVariable("id") Long id);
}