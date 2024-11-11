package ar.edu.info.unlp.ejercicioDemo;

import java.util.LinkedList;
import java.util.List;

public class MediaPlayer {
    private List<Media> media = new LinkedList<Media>();
    public void play(int i){
        if(i < media.size()){
            media.get(i).play();
        }
    }

}
