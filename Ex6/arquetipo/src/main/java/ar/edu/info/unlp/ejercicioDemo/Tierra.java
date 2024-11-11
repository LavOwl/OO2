package ar.edu.info.unlp.ejercicioDemo;

public class Tierra extends Topografia {

    @Override
    public double getEarthRatio() {
        return 1;
    }

    @Override
    public double getWaterRatio(){
        return 0;
    }

    public boolean equalsTo(Topografia t){
        return (t.getEarthRatio() == 1);
    }
}
