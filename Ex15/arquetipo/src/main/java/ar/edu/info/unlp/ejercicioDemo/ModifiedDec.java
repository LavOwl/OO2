package ar.edu.info.unlp.ejercicioDemo;

public class ModifiedDec extends Decorator {

    public ModifiedDec(Decorator decorator){
        super(decorator);
    }

    public String prettyPrint(){
        return this.decorated.prettyPrint() + this.decorated.getModified();
    }
}
