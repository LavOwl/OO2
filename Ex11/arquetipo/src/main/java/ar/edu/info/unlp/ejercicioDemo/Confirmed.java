package ar.edu.info.unlp.ejercicioDemo;

public class Confirmed extends State {
    
    public Confirmed(Proyecto p){
        super(p);
    }

    public void cancel(){
        Proyecto p = this.getProject();
        p.setName(p.getName() + " (Cancelled)");
        p.setState(new Cancelled(p));
    }

    public void aprobarEtapa(){

    }

    public void modify(double returns){
        
    }
}
