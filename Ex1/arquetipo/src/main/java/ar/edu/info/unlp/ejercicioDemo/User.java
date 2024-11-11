package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<NewTweet> tweets;
    private String screenName;

    public User(String screenName){
        this.screenName = screenName;
        this.tweets = new ArrayList<NewTweet>();
    }

    public void deleteTweets(){
        tweets.clear();
    }

    public String getScreenName(){
        return this.screenName;
    }

    public NewTweet addTweet(String text){
        NewTweet t = null;
        if((text.length() > 0) && (text.length() < 281)){
            t = new NewTweet(text);
            tweets.add(t);
        }
        return t;
    }


}
