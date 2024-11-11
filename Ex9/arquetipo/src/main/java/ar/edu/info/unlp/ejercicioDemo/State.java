package ar.edu.info.unlp.ejercicioDemo;

public abstract class State {
    private Excursion excursion;

    public State(Excursion e){
        this.excursion = e;
    }

    public Excursion getExcursion(){
        return this.excursion;
    }

    public abstract void inscribir(User u);
    public abstract String getInfo();
}
