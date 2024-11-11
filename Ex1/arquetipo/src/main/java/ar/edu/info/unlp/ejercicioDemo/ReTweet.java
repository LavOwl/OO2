package ar.edu.info.unlp.ejercicioDemo;

public class ReTweet extends Tweet {
    private NewTweet origin;

    public ReTweet(NewTweet origin){
        this.origin = origin;
    }

    public String getText(){
        return this.origin.getText();
    }
}
