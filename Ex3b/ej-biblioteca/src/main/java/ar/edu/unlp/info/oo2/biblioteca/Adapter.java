package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Adapter extends VoorheesExporter{

    private JSONObject exportar(Socio socio){
        JSONObject a = new JSONObject();
        a.put("nombre", socio.getNombre());
        a.put("email", socio.getEmail());
        a.put("legajo", socio.getLegajo());
        return a;
    }

    public String exportar(List<Socio> socios){
        JSONArray JSA = new JSONArray();
        for (Socio socio : socios) {
            JSA.add(this.exportar(socio));
        }
        return JSA.toJSONString();
    }
}
