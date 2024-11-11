package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String title;
    private int year;
    private double rating;
    private List<Pelicula> related;

    public Pelicula(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public void stablishSimilitude(Pelicula movie){
        if(!this.related.contains(movie)){
            this.related.add(movie);
            movie.stablishSimilitude(this);
        }
    }

    public int getYear(){
        return this.year;
    }

    public List<Pelicula> getRelated(){
        return new ArrayList<Pelicula>(this.related);
    }

    public double getRating(){
        return this.rating;
    }
}
