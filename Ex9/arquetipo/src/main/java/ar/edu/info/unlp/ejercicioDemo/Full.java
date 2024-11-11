package ar.edu.info.unlp.ejercicioDemo;

public class Full extends State {
    
    public Full(Excursion e){
        super(e);
    }

    public void inscribir(User u){
        this.getExcursion().getWaitingList().add(u);
    }

    public String getInfo(){
        Excursion e = this.getExcursion();
        return e.getName() + " " + e.getCost() + " " + e.getStart() + " " + e.getEnd() + " " + e.getMeetingPoint();
    }
}
