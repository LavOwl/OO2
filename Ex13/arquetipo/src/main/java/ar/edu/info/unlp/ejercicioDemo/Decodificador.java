package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> seen;
    private Strategy strategy;

    public Decodificador(List<Pelicula> grilla, Strategy strategy){
        this.grilla = new ArrayList<Pelicula>(grilla);
        this.strategy = strategy;
        this.seen = new ArrayList<Pelicula>();
    }

    public List<Pelicula> showGrilla(){
        return new ArrayList<Pelicula>(this.grilla);
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public List<Pelicula> sugerirPelis(){
        return this.strategy.sugerirPelis();
    }

    public void reproduceMovie(Pelicula movie){
        if(!this.seen.contains(movie)){
            this.seen.add(movie);
        }
    }

    protected List<Pelicula> getSeen(){
        return new ArrayList<Pelicula>(this.seen);
    }
}
