package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStationC implements WeatherData {
    private HomeWeatherStation farenheit;

    public double getTemperatura(){
        return (this.farenheit.getTemperatura() - 32)/1.8;
    }

    public double getPresion(){
        return this.farenheit.getPresion();
    }

    public double getRadiacionSolar(){
        return this.farenheit.getRadiacionSolar();
    }

    public List<Double> getTemperaturas(){
        List<Double> aux = this.getTemperaturas();
        List<Double> ret = new ArrayList<>();
        for (Double d : aux) {
            ret.add((d-32)/1.8);
        }
        return ret;
    }

    public String displayData(){
        return "Temperatura C: " + this.getTemperatura() +
                 "Presión atmosf: " + this.getPresion() +
                 "Radiación solar: " + this.getRadiacionSolar();
    }
        
}
