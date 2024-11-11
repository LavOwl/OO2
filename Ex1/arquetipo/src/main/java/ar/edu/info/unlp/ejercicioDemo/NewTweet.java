package ar.edu.info.unlp.ejercicioDemo;

public class NewTweet extends Tweet{
    private String text;

    public NewTweet(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
