package ar.edu.info.unlp.ejercicioDemo;

import java.util.Random;

public class CompraBonoBajoRiesgo extends Producto {
    private int parking;

    public CompraBonoBajoRiesgo(int parking){
        this.parking = parking;
    }

    public double retornoInversion(double montoInicial){
        return montoInicial + (new Random().nextInt(21) - 10)/100 * montoInicial;
    }

    public int getParking(){
        return this.parking;
    }
}
