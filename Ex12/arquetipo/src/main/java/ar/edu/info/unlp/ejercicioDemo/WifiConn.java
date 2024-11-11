package ar.edu.info.unlp.ejercicioDemo;

public class WifiConn implements IConnection {
    private String pict = "Conexión establecida";

    public String sendData(String data, long crc){
        return data;
    }

    public String pict(){
        return this.pict;
    }
}
