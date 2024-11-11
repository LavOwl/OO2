package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class Finished extends State {
    public void start(ToDoItem obj){
        
    }

    public void finish(ToDoItem obj){
        
    }

    public void togglePause(ToDoItem obj){
        throw new RuntimeException("No se puede pausar una actividad finalizada!");
    }

    public Duration workedTime(ToDoItem obj){
        return Duration.between(obj.getStarted(), obj.getFinished());
    }

    public void addComment(ToDoItem obj, String comment){

    }
}
