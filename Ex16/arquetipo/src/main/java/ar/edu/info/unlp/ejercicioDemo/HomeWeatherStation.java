package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private double temperatura;
    private double presion;
    private double radiacion;
    private List<Double> historial = new ArrayList<>();

    public double getTemperatura(){
        return this.temperatura;
    }

    public double getPresion(){
        return this.presion;
    }

    public double getRadiacionSolar(){
        return this.radiacion;
    }

    public List<Double> getTemperaturas(){
        return new ArrayList<>(this.historial);
    }

    public String displayData(){
        return "Temperatura F: " + this.getTemperatura() +
                 "Presión atmosf: " + this.getPresion() +
                 "Radiación solar: " + this.getRadiacionSolar();
    }
        
}
