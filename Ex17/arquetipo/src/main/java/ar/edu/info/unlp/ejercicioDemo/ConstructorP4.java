package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ConstructorP4 extends Constructor{
    public ProductoCombinado factoryMethod(){
        List<Producto> aux = new ArrayList<Producto>();
        aux.add(new CompraBonoAltoRiesgo(24));
        aux.add(new CompraBonoAltoRiesgo(24));
        aux.add(new CompraBonoAltoRiesgo(24));
        return new ProductoCombinado(aux);
    }
    
}
