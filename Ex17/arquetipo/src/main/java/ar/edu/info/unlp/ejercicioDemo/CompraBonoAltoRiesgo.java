package ar.edu.info.unlp.ejercicioDemo;

import java.util.Random;

public class CompraBonoAltoRiesgo extends Producto{
    private int parking;

    public CompraBonoAltoRiesgo(int parking){
        this.parking = parking;
    }

    public double retornoInversion(double montoInicial){
        return montoInicial + (new Random().nextInt(141) - 70)/100 * montoInicial;
    }

    public int getParking(){
        return this.parking;
    }
}
