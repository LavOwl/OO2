package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ConstructorP3 extends Constructor {

    public ProductoCombinado factoryMethod(){
        List<Producto> aux = new ArrayList<Producto>();
        aux.add(new CompraBonoBajoRiesgo(24));
        aux.add(new CompraDolares(1000));
        aux.add(new PlazoFijo(30, 6));
        aux.add(new CompraBonoAltoRiesgo(24));
        return new ProductoCombinado(aux);
    }
    
}
