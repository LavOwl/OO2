package ar.edu.info.unlp.ejercicioDemo;

public abstract class Empleado {
    public double getSalary(){
        return this.getBase() + this.getExtra() - this.getDiscount();
    }
    protected abstract double getBase();
    protected abstract double getExtra();

    private double getDiscount(){
        return this.getBase()*0.13 + this.getExtra()*0.05;
    }
}
