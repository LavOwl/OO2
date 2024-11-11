package ar.edu.info.unlp.ejercicioDemo;

public class PermissionsDec extends Decorator {

    public PermissionsDec(Decorator decorator){
        super(decorator);
    }

    public String prettyPrint(){
        return this.decorated.prettyPrint() + this.decorated.getPermissions();
    }
}
