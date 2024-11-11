package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Component {
    public abstract String prettyPrint();

    public abstract String getName();

    public abstract String getPermissions();

    public abstract String getExtension();

    public abstract LocalDate getCreated();

    public abstract LocalDate getModified();

    public abstract double getSize();
}
