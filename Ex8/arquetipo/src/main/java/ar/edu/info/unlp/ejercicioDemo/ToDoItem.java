package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private State estado;
    private List<String> comments;
    private LocalDate started;
    private LocalDate finished;

    public ToDoItem(String name){
        this.name = name;
        this.estado = new Pending();
        this.comments = new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }

    public void setState(State s){
        this.estado = s;
    }

    public void start(){
        estado.start(this);
    }

    public void togglePause(){
        estado.togglePause(this);
    }

    public void finish(){
        estado.finish(this);
    }

    public Duration workedTime(){
        return null;
    }

    public void addComment(String comment){
        estado.addComment(this, comment);
    }

    protected void realAdd(String comment){
        this.comments.add(comment);
    }

    protected void setStarted(LocalDate date){
        this.started = date;
    }

    protected LocalDate getStarted(){
        return this.started;
    }

    protected void setFinished(LocalDate date){
        this.finished = date;
    }

    protected LocalDate getFinished(){
        return this.finished;
    }
}
