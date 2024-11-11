package ar.edu.info.unlp.ejercicioDemo;

public class Dispositivo {
    private ICalculator calculadora;
    private IConnection connection;
    private Display display;
    private Ringer ringer;

    public Dispositivo(ICalculator calculadora, IConnection connection){
        this.display = new Display();
        this.ringer = new Ringer();
        this.calculadora = calculadora;
        this.connection = connection;
    }

    public String send(String data){
        return connection.sendData(data, calculadora.crcFor(data));
    }

    public void setConnection(IConnection connection){
        this.connection = connection;
        this.ringer.ring();
        this.display.showBanner(this.connection.pict());
    }

    public void setCalculadora(ICalculator calculadora){
        this.calculadora = calculadora;
    }
}
