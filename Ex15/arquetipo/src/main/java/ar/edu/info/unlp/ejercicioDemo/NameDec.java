package ar.edu.info.unlp.ejercicioDemo;

public class NameDec extends Decorator {

    public NameDec(Decorator decorator){
        super(decorator);
    }

    public String prettyPrint(){
        return this.decorated.prettyPrint() + this.decorated.getName();
    }
}
