package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Waiting extends State{
    
    public Waiting(Excursion e){
        super(e);
    }

    public void inscribir(User u){
        List<User> aux = this.getExcursion().getSignedUp();
        aux.add(u);
        if(aux.size() == this.getExcursion().getMin())
            this.getExcursion().setState(new Confirmed(getExcursion()));
    }

    public String getInfo(){
        Excursion e = this.getExcursion();
        List<User> users = e.getSignedUp();
        String aux = e.getName() + " " + e.getCost() + " " + e.getStart() + " " + e.getEnd() + " " + e.getMeetingPoint() + "\n";
        return aux + (e.getMin() - users.size());
    }
}
