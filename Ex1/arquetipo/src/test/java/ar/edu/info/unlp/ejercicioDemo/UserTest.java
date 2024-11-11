package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    private User u;

    @BeforeEach
    public void setUp(){
        u = new User("Hilda");
        u.addTweet("Pato-Tortuga");
        
    }

    @Test
    public void testDeleteTweets(){

    }

    @Test
    public void testAddTweet(){

    }
}
