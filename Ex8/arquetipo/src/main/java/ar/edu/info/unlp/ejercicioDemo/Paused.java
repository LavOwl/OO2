package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class Paused extends State{
    public void start(ToDoItem obj){
        
    }

    public void togglePause(ToDoItem obj){
        obj.setState(new InProgress());
    }

    public void finish(ToDoItem obj){
        obj.setState(new Finished());
        obj.setFinished(LocalDate.now());
    }

    public Duration workedTime(ToDoItem obj){
        return Duration.between(obj.getStarted(), LocalDate.now());
    }

    public void addComment(ToDoItem obj, String comment){
        obj.realAdd(comment);
    }
}
