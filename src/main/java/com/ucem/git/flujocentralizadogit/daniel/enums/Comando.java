package com.ucem.git.flujocentralizadogit.daniel.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Comando {
    INIT("git init","Inicializa un nuevo repositorio Git en un directorio vacío o existente.","git init","Ubicarse en la carpeta donde se clonará el proyecto y ejecutar el comando"),
    ADD("git-add","Agrega cambios o archivos nuevos al índice (staging area)","git add archivo.txt","Agrega el archivo.txt al área de staging"),
    COMMIT("git commit -m ","Guarda los cambios en el repositorio de manera permanente con un mensaje que los describe.","Agregado archivo.txt\"","Guarda los cambios realizados con el mensaje \"Agregado archivo.txt\""),
    STATUS("git status","Muestra el estado actual del repositorio y los archivos que han sido modificados","git status","Muestra el estado actual del repositorio"),
    LOG("git log","Muestra el historial de cambios en el repositorio.","git log","Muestra el historial de cambios en el repositorio"),
    BRANCH("git branch","Muestra las ramas del repositorio.","git branch --all","Muestra las ramas visibles y ocultas del repositorio."),
    CHECKOUT("git checkout","Cambia de rama o estado del repositorio","git checkout master","Cambia al estado del repositorio de la rama master"),
    CLONE("git clone","Clona un repositorio Git existente en una nueva carpeta.","git clone https://github.com/usuario/repo.git","Clona el repositorio en la carpeta actual"),
    PULL("git pull","Descarga los cambios desde el repositorio remoto y los fusiona con la rama actual.","git pull origin master","Descarga los cambios de la rama master en el repositorio remoto"),
    PUSH("git push","Sube los cambios locales a un repositorio remoto","git push origin master","Sube los cambios de la rama master al repositorio remoto");

    private final String comando;
    private final String descripcion;
    private final String ejemplo;
    private final String descEjemplo;

    Comando(String comando, String descripcion, String ejemplo, String descEjemplo) {
        this.comando = comando;
        this.descripcion = descripcion;
        this.ejemplo = ejemplo;
        this.descEjemplo = descEjemplo;
    }

    public static List<Comando> getComandos(){
        return Arrays.asList(Comando.values());
    }

    public static Comando getComandoByCode(final String var){
        return getComandos().stream().filter(x->x.getComando().equalsIgnoreCase(var)).findFirst().orElse(null);
    }
    @JsonValue
    public static List<Comando> getComandostoJSON(){
        return getComandos();
    }

}
