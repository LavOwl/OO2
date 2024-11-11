package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Decorator extends Component{
    protected Component decorated;

    public Decorator(Component decorated){
        this.decorated = decorated;
    }

    public abstract String prettyPrint();

    public String getName(){
        return this.decorated.getName();
    }

    public String getExtension(){
        return this.decorated.getExtension();
    }

    public double getSize(){
        return this.decorated.getSize();
    }

    public LocalDate getCreated(){
        return this.decorated.getCreated();
    }

    public LocalDate getModified(){
        return this.decorated.getModified();
    }

    public String getPermissions(){
        return this.decorated.getPermissions();
    }
}
