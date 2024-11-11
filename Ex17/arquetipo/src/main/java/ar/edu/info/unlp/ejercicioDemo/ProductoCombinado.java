package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado extends Producto {
    private List<Producto> productos;

    public ProductoCombinado(List<Producto> list){
        this.productos = new ArrayList<Producto>(list);
    }

    public double retornoInversion(double montoInicial){
        double aux = montoInicial;
        for (Producto producto : productos) {
            aux = producto.retornoInversion(aux);
        }
        return aux;
    }
}
