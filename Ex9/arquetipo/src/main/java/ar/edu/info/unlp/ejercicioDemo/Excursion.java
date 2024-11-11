package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String name;
    private LocalDate start;
    private LocalDate end;
    private String meetingPoint;
    private double cost;
    private int min;
    private int max;
    private State state;
    private List<User> signedUp;
    private List<User> waitingList;

    public Excursion(String name, LocalDate start, LocalDate end, String meetingPoint, double cost, int min, int max) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.meetingPoint = meetingPoint;
        this.cost = cost;
        this.min = min;
        this.max = max;
        this.state = new Waiting(this);
        this.signedUp = new ArrayList<User>();
        this.waitingList = new ArrayList<User>();
    }

    public String obtenerInformacion(){
        return this.state.getInfo();
    }

    public void inscribir(User u){
        this.state.inscribir(u);
    }

    protected List<User> getWaitingList(){
        return this.waitingList;
    }

    protected List<User> getSignedUp(){
        return this.signedUp;
    }

    protected int getMax(){
        return this.max;
    }

    protected int getMin(){
        return this.min;
    }

    protected void setState(State state){
        this.state = state;
    }

    protected String getName() {
        return name;
    }

    protected LocalDate getStart() {
        return start;
    }

    protected LocalDate getEnd() {
        return end;
    }

    protected String getMeetingPoint() {
        return meetingPoint;
    }

    protected double getCost() {
        return cost;
    }
}
