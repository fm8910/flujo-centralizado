package com.ucem.git.flujocentralizadogit.daniel.services;

import com.ucem.git.flujocentralizadogit.daniel.enums.Comando;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComandosService {

    public static List<Comando> getComandos(){
        return Comando.getComandos();
    }

    public static Comando getComandoByCode(final String var){
        return Comando.getComandoByCode(var);
    }

}
