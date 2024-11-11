package ar.edu.info.unlp.ejercicioDemo;

public class Evaluating extends State {
    
    public Evaluating(Proyecto p){
        super(p);
    }

    public void cancel(){
        Proyecto p = this.getProject();
        p.setName(p.getName() + " (Cancelled)");
        p.setState(new Cancelled(p));
    }

    public void aprobarEtapa(){
        this.getProject().setState(new Confirmed(getProject()));
    }

    public void modify(double returns){
        Proyecto p = this.getProject();
        if(p.getMargen() <= 10 && p.getMargen() >= 8)
            p.setMargen(returns);
    }
}
