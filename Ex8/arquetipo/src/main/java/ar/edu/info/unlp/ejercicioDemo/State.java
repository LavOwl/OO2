package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public abstract class State {



    public abstract void start(ToDoItem obj);

    public abstract void togglePause(ToDoItem obj);

    public abstract void finish(ToDoItem obj);

    public abstract Duration workedTime(ToDoItem obj);

    public abstract void addComment(ToDoItem obj, String comment);
}
