package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private List<User> users;

    public Twitter(){
        this.users = new ArrayList<User>();
    }

    public void deleteUser(String screenName){
        User u = users.stream().filter(us -> (us.getScreenName() == screenName)).findAny().orElse(null);
        if(u != null){
            u.deleteTweets();
            users.remove(u);
        }
    }

    public User addUser(String screenName){
        User us = null;
        if(!users.stream().filter(u -> (u.getScreenName() == screenName)).findAny().isPresent()){
            us = new User(screenName);
            users.add(us);
        }
        return us;
    }

    public NewTweet addTweet(User u, String text){
        return u.addTweet(text);
    }
}
