package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
    private String name;
    private LocalDate start;
    private LocalDate end;
    private String objective;
    private int members;
    private double pay;
    private double returns;
    private State state;
    
    public Proyecto(String name, LocalDate start, LocalDate end, String objective, int members, double pay){
        this.name = name;
        this.start = start;
        this.end = end;
        this.objective = objective;
        this.members = members;
        this.pay = pay;
        this.returns = 7;
        this.state = new Constructing(this);
    }

    public void aprobarEtapa(){
        this.state.aprobarEtapa();
    }

    public double getCosto(){
        return ChronoUnit.DAYS.between(start, end) * this.members * this.pay;
    }

    public double getPrice(){
        return this.getCosto() / (100 - this.returns) * 100;
    }

    public void cancel(){
        this.state.cancel();
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setState(State state){
        this.state = state;
    }

    public void modificarMargen(double returns){
        this.state.modify(returns);
    }

    protected double getMargen() {
        return returns;
    }

    protected void setMargen(double returns) {
        this.returns = returns;
    }

    
}
