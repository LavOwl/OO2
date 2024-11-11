package ar.edu.info.unlp.ejercicioDemo;

public class Adapter extends Media{
    //Clase estereotipo adapter
    private VideoStream VS;

    public void play(){
        VS.reproduce();
    }
}
