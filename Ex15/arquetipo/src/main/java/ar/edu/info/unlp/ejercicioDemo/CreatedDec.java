package ar.edu.info.unlp.ejercicioDemo;

public class CreatedDec extends Decorator {

    public CreatedDec(Decorator decorator){
        super(decorator);
    }

    public String prettyPrint(){
        return this.decorated.prettyPrint() + this.decorated.getCreated();
    }
}
