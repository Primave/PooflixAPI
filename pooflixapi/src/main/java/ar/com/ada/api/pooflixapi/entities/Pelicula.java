package ar.com.ada.api.pooflixapi.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Peliculas") 
public class Pelicula extends Contenido {

    private int duracionEnMinutos;

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
}