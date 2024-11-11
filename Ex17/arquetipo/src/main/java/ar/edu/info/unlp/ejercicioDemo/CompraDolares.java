package ar.edu.info.unlp.ejercicioDemo;

public class CompraDolares extends Producto {
    private double valorCompra;

    public CompraDolares(double valorCompra){
        this.valorCompra = valorCompra;
    }

    public double retornoInversion(double montoInicial){
        return montoInicial/valorCompra;
    }
}
