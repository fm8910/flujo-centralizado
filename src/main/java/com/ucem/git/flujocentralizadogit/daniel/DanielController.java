package com.ucem.git.flujocentralizadogit.daniel;

import com.ucem.git.flujocentralizadogit.daniel.enums.Comando;
import com.ucem.git.flujocentralizadogit.daniel.services.ComandosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/daniel")
public class DanielController {

    private final ComandosService oComandosService;

    @Autowired
    public DanielController(ComandosService oComandosService) {
        this.oComandosService = oComandosService;
    }

//    @GetMapping(value = "/todos", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Comando>> buscarTodos(){
//        return new ResponseEntity<>(oComandosService.getComandos() , HttpStatus.OK);
//    }
    @GetMapping(value = "/todos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Comando>> buscarTodos(){
        return new ResponseEntity<>(oComandosService.getComandostoJSON() , HttpStatus.OK);
    }

    @GetMapping(value = "/code/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Comando> buscarPorId(@PathVariable String code){
        return new ResponseEntity<>(oComandosService.getComandoByCode(code), HttpStatus.OK);
    }


}
