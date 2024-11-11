package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {
    private List<FileSystem> content;
    
    public Directorio(String name){
        super(name, LocalDate.now(), 32);
        this.content = new ArrayList<FileSystem>();
    }

    public int tamanoTotalOcupado(){
        return this.getSize() + this.content.stream().mapToInt(f -> f.tamanoTotalOcupado()).sum();
    }

    public Archivo archivoMasGrande(){
        int max = -1;
        Archivo ret = null;
        for (FileSystem fs : content) {
            Archivo aux = fs.archivoMasGrande();
            if(aux != null && aux.tamanoTotalOcupado() < max){
                ret = aux;
                max = aux.tamanoTotalOcupado();
            }
        }
        return ret;
    }

    public Archivo archivoMasNuevo(){
        LocalDate max = LocalDate.now();
        Archivo ret = null;
        for (FileSystem fs : content) {
            Archivo aux = fs.archivoMasNuevo();
            if(aux != null && aux.getDate().isBefore(max)){
                ret = aux;
                max = aux.getDate();
            }
        }
        return ret;
    }

    public FileSystem buscar(String nombre){
        if(this.getName() == nombre)
            return this;
        else{
            for (FileSystem fs : content) {
                FileSystem aux = fs.buscar(nombre);
                if(aux != null){
                    return aux;
                }
            }
            return null;
        }
    }

    public List<FileSystem> buscarTodos(String nombre){
        List<FileSystem> aux = new ArrayList<>();
        if(this.getName() == nombre)
            aux.add(this);
        this.content.stream().forEach(f -> aux.addAll(f.buscarTodos(nombre)));
        return aux;
    }

    public String listadoDeContenido(){
        String aux;
        String ret = "/" + this.getName() + "\n";
        for (FileSystem fs : content) {
            aux = fs.listadoDeContenido();
            String[] arr = aux.split("\n");
            for (String st : arr) {
                ret = ret + "/" + this.getName() + st + "\n";
            }
        }
        return ret;
    }
}
