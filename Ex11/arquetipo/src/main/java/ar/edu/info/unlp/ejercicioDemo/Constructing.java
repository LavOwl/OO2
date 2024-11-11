package ar.edu.info.unlp.ejercicioDemo;

public class Constructing extends State {
    
    public Constructing(Proyecto p){
        super(p);
    }

    public void cancel(){
        Proyecto p = this.getProject();
        p.setName(p.getName() + " (Cancelled)");
        p.setState(new Cancelled(p));
    }

    public void aprobarEtapa(){
        if(this.getProject().getPrice() != 0)
            this.getProject().setState(new Evaluating(getProject()));
        else
            throw new RuntimeException("Proyecto sin precio");
    }

    public void modify(double returns){
        Proyecto p = this.getProject();
        if(p.getMargen() <= 10 && p.getMargen() >= 8)
            p.setMargen(returns);
    }
}
