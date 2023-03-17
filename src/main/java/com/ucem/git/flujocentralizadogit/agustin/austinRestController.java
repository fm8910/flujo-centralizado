package com.ucem.git.flujocentralizadogit.agustin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
public class austinRestController {

    @GetMapping(value = "/{nombre}", produces = "application/json")
    public Person getData(@PathVariable String nombre) {
        return getPerson(nombre);
    }

    private Person getPerson(String nombre) {
        Person persona = new Person(nombre, "Curso git 2023", 1988);
        return persona;
    }



}