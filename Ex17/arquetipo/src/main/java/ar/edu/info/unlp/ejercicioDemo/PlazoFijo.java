package ar.edu.info.unlp.ejercicioDemo;

public class PlazoFijo extends Producto {
    private int cantidadDeDias;
    private double interes;

    public PlazoFijo(int cantidadDeDias, double interes){
        this.cantidadDeDias = cantidadDeDias;
        this.interes = interes;
    }

    public double retornoInversion(double montoInicial){
        return this.cantidadDeDias * montoInicial * (1 + interes);
    }
}
