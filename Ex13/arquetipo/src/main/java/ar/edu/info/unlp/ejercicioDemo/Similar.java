package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Similar extends Strategy {
    protected List<Pelicula> sortByOrder(Decodificador decodificador){
        List<Pelicula> aux = new ArrayList<>();
        decodificador.getSeen().forEach(p -> aux.addAll(p.getRelated()));
        return aux.stream().distinct().sorted((p1, p2) -> Integer.compare(p2.getYear(), p1.getYear())).collect(Collectors.toList());
    }
}
