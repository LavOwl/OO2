package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Strategy {

    public List<Pelicula> sugerirPelis(Decodificador decodificador){
        List<Pelicula> l = decodificador.getSeen();
        return this.sortByOrder(decodificador).stream().filter(p -> l.contains(p)).limit(3).collect(Collectors.toList());
    }

    protected abstract List<Pelicula> sortByOrder(Decodificador decodificador);
}
