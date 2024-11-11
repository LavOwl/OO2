package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class FileOO2 extends Component {
    private String name;
    private String extension;
    private double size;
    private LocalDate created;
    private LocalDate modified;
    private String permissions;

    public String prettyPrint(){
        return "";
    }

    public String getName(){
        return this.name;
    }

    public String getExtension(){
        return this.extension;
    }

    public double getSize(){
        return this.size;
    }

    public LocalDate getCreated(){
        return this.created;
    }

    public LocalDate getModified(){
        return this.modified;
    }

    public String getPermissions(){
        return this.permissions;
    }

}
