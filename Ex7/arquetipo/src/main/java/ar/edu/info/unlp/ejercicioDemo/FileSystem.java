package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
    private String name;
    private LocalDate date;
    private int size;

    public FileSystem(String name, LocalDate date, int size){
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract int tamanoTotalOcupado();
    public abstract Archivo archivoMasGrande();
    public abstract Archivo archivoMasNuevo();
    public abstract FileSystem buscar(String nombre);
    public abstract List<FileSystem> buscarTodos(String nombre);
    public abstract String listadoDeContenido();
}
