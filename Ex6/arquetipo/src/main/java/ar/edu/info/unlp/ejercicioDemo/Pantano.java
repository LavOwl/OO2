package ar.edu.info.unlp.ejercicioDemo;

public class Pantano extends Topografia {
   
    @Override
    public double getEarthRatio() {
        return 0.3;
    }

    @Override
    public double getWaterRatio(){
        return 0.7;
    }

    public boolean equalsTo(Topografia t){
        return t.getHijos() == null && t.getEarthRatio() == 0.3;
    }

}
