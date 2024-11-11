package ar.edu.info.unlp.ejercicioDemo;

public class SizeDec extends Decorator {

    public SizeDec(Decorator decorator){
        super(decorator);
    }

    public String prettyPrint(){
        return this.decorated.prettyPrint() + this.decorated.getSize();
    }
}
