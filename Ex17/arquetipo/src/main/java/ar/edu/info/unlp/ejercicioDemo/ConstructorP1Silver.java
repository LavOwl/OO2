package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ConstructorP1Silver extends Constructor{

    public ProductoCombinado factoryMethod(){
        List<Producto> aux = new ArrayList<Producto>();
        aux.add(new CompraDolares(1000));
        aux.add(new PlazoFijo(35, 5));
        aux.add(new CompraPesos(1/1000));
        return new ProductoCombinado(aux);
    }
}
