package ar.edu.info.unlp.ejercicioDemo;

public class Agua extends Topografia{
    
    @Override
    public double getEarthRatio() {
        return 0;
    }

    @Override
    public double getWaterRatio(){
        return 1;
    }

    public boolean equalsTo(Topografia t){
        return (t.getWaterRatio() == 1);
    }
}
