package ar.edu.info.unlp.ejercicioDemo;

public class CompraPesos extends Producto {
    private double valorCompra;

    public CompraPesos(double valorCompra){
        this.valorCompra = valorCompra;
    }

    public double retornoInversion(double montoInicial){
        return montoInicial/valorCompra;
    }
}
