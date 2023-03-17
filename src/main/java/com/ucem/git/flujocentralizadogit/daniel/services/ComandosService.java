package com.ucem.git.flujocentralizadogit.daniel.services;

import com.ucem.git.flujocentralizadogit.daniel.enums.Comando;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComandosService {

    public List<Comando> getComandos(){
        return Comando.getComandos();
    }  public List<Comando> getComandostoJSON(){
        return Comando.getComandostoJSON();
    }

    public Comando getComandoByCode(final String var){
        return Comando.getComandoByCode(var);
    }

}
