package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class AddMinMax extends Configuration{

    public double getPresion(){
        return this.decorated.getPresion();
    }

    public double getRadiacionSolar(){
        return this.decorated.getRadiacionSolar();
    }

    public List<Double> getTemperaturas(){
        return this.getTemperaturas();
    }

    public double getTemperatura(){
        return this.decorated.getTemperatura();
    }

    public String displayData(){
        return this.decorated.displayData() + "Mínimo: " + this.getTemperaturas().stream().mapToDouble(d -> d).min() + "Maximo: " + this.getTemperaturas().stream().mapToDouble(d -> d).max();
    }
}