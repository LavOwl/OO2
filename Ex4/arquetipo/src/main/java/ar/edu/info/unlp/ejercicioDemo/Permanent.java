package ar.edu.info.unlp.ejercicioDemo;

public class Permanent extends FamilialBenefits {
    private double base = 50000;
    private int yearsOfWork;
    private double payPerYear = 2000;


    public Permanent(boolean isMarried, int children, int yearsOfWork){
        super(isMarried, children);
        this.yearsOfWork = yearsOfWork;
    }

    protected double getBase(){
        return this.base;
    }

    protected double getExtra(){
        return this.yearsOfWork*this.payPerYear + this.getFamilialBenefits();
    }

    public void addYear(){
        this.yearsOfWork++;
    }
}
