package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class Pending extends State {
    public void start(ToDoItem obj){
        obj.setState(new InProgress());
        obj.setStarted(LocalDate.now());
    }

    public void togglePause(ToDoItem obj){
        throw new RuntimeException("No se puede pausar una actividad no iniciada!");
    }

    public void finish(ToDoItem obj){
        
    }

    public Duration workedTime(ToDoItem obj){
        throw new RuntimeException("Esta actividad nunca se inició! No tiene tiempo de trabajo");
    }

    public void addComment(ToDoItem obj, String comment){
        obj.realAdd(comment);
    }
}
