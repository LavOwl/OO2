package ar.edu.info.unlp.ejercicioDemo;

public class AdapterConnection4G implements IConnection {
    private Connection4G connection;

    public String sendData(String data, long crc){
        return this.connection.transmit(data, crc);
    }

    public String pict(){
        return this.connection.symb();
    }
    
}
