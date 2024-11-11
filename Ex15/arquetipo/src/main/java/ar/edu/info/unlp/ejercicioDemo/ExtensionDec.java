package ar.edu.info.unlp.ejercicioDemo;

public class ExtensionDec extends Decorator {

    public ExtensionDec(Decorator decorator){
        super(decorator);
    }

    public String prettyPrint(){
        return this.decorated.prettyPrint() + this.decorated.getExtension();
    }
}
