package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Confirmed extends State {
    
    public Confirmed(Excursion e){
        super(e);
    }

    public void inscribir(User u){
        List<User> aux = this.getExcursion().getSignedUp();
        aux.add(u);
        if(aux.size() == this.getExcursion().getMax())
            this.getExcursion().setState(new Confirmed(getExcursion()));
    }

    public String getInfo(){
        Excursion e = this.getExcursion();
        List<User> users = e.getSignedUp();
        String aux = e.getName() + " " + e.getCost() + " " + e.getStart() + " " + e.getEnd() + " " + e.getMeetingPoint() + "\n";
        for (User u : users) {
            aux = aux + u.getMail() + "\n";
        }
        return aux + (e.getMax() - users.size());
    }
}
