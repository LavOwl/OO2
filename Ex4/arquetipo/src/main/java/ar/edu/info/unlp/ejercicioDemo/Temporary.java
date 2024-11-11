package ar.edu.info.unlp.ejercicioDemo;

public class Temporary extends FamilialBenefits {
    private int hoursWorked;
    private double payPerHour = 300;
    private double base = 20000;

    public Temporary(boolean isMarried, int children, int hoursWorked){
        super(isMarried, children);
        this.hoursWorked = hoursWorked;
    }

    protected double getBase(){
        return this.base + this.payPerHour*this.hoursWorked;
    }

    protected double getExtra(){
        return this.getFamilialBenefits();
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
}
