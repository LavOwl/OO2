package ar.edu.info.unlp.ejercicioDemo;

public abstract class State {
    private Proyecto project;
    
    public State(Proyecto p){
        this.project = p;
    }

    protected Proyecto getProject(){
        return this.project;
    }

    public abstract void aprobarEtapa();
    public abstract void cancel();
    public abstract void modify(double returns);
}
