package ar.edu.info.unlp.ejercicioDemo;

public class Passing extends Empleado {
    private double base = 20000;
    private int exams;
    private double payPerExam = 2000;

    public Passing(int exams){
        this.exams = exams;
    }

    protected double getBase(){
        return this.base;
    }

    protected double getExtra(){
        return this.exams * this.payPerExam;
    }

    public void passExam(){
        this.exams++;
    }
}
