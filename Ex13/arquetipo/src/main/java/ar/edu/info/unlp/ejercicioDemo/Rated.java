package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class Rated extends Strategy {
    protected List<Pelicula> sortByOrder(Decodificador decodificador){
        return decodificador.showGrilla().stream().sorted((p1, p2) -> (Double.compare(p2.getRating(), p1.getRating()) != 0) ? Double.compare(p2.getRating(), p1.getRating()) : Integer.compare(p2.getYear(), p1.getYear())).collect(Collectors.toList());
    }
}