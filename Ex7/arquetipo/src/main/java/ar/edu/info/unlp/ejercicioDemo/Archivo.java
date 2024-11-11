package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends FileSystem{

    public Archivo(String name, int size){
        super(name, LocalDate.now(), size);
    }

    public int tamanoTotalOcupado(){
        return this.getSize();
    }

    public Archivo archivoMasGrande(){
        return this;
    }

    public Archivo archivoMasNuevo(){
        return this;
    }

    public FileSystem buscar(String nombre){
        if(this.getName().equals(nombre))
            return this;
        return null;
    }

    public List<FileSystem> buscarTodos(String nombre){
        ArrayList<FileSystem> ret = new ArrayList<FileSystem>();
        ret.add(this);
        return ret;
    }

    public String listadoDeContenido(){
        return "/" + this.getName() + "\n";
    }
}
