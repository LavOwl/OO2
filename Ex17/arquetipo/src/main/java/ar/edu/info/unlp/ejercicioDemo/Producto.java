package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Producto {
    private LocalDate fechaOperacion;

    public Producto(){
        this.fechaOperacion = LocalDate.now();
    }

    public LocalDate getFechaOperacion(){
        return this.fechaOperacion;
    }

    public abstract double retornoInversion(double montoInicial);
}
