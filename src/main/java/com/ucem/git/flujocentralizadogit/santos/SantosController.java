package com.ucem.git.flujocentralizadogit.santos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superhero")
public class SantosController {

    @GetMapping("/get")
    public String getHero() {
        return "Scott Summer - Cyclops";
    }

}
