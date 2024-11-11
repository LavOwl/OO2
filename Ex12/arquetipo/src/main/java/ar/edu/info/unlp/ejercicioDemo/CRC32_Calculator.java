package ar.edu.info.unlp.ejercicioDemo;

import java.util.zip.CRC32;

public class CRC32_Calculator {
    CRC32 crc;

    public long crcFor(String datos) {
        crc = new CRC32();
        crc.update(datos.getBytes());
        return crc.getValue();
    }
}
