package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public abstract class Topografia {
    public abstract double getWaterRatio();
    public abstract double getEarthRatio();
    public abstract boolean equalsTo(Topografia t);
    public List<Topografia> getHijos(){
        return null;
    }
}
