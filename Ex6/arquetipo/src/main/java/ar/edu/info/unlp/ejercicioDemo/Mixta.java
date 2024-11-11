package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {
    private List<Topografia> hijos;

    public Mixta(Topografia a, Topografia b, Topografia c, Topografia d){
        this.hijos = new ArrayList<>(null);
        hijos.add(a);
        hijos.add(b);
        hijos.add(c);
        hijos.add(d);
    }

    @Override
    public double getEarthRatio() {
        return this.hijos.stream().mapToDouble(h -> h.getEarthRatio()).sum()/4;
    }

    @Override
    public double getWaterRatio() {
        return this.hijos.stream().mapToDouble(h -> h.getWaterRatio()).sum()/4;
    }

    @Override
    public boolean equalsTo(Topografia t) {
        boolean ret = true;
        int i = 0;
        List<Topografia> thijos = t.getHijos();
        if(thijos == null)
            return false;
        while(i < 4 || ret){
            ret = ret || this.hijos.get(i).equalsTo(thijos.get(i));
            i++;
        }
        return ret;
    }

    @Override
    public List<Topografia> getHijos() {
        return this.hijos;
    }

}
