package ar.edu.info.unlp.ejercicioDemo;

import java.util.HashMap;

public class Solution {
    private HashMap<String, Integer> opt = new HashMap<String, Integer>();

    public Solution(){
        opt.put("Rock", 1);
        opt.put("Paper", 2);
        opt.put("Sissors", 3);
        opt.put("Spock", 4);
        opt.put("Lizard", 5);
    }


    public String whoWins(String a, String b){
        if(!(opt.containsKey(a) && opt.containsKey(b)))
            return "Invalid input";
        
        int i = opt.get(a);
        int j = opt.get(b);
        a = a + "wins!";
        b = b + "wins!";

        if(i == j){
            return "Draw";
        }

        if((i % 2) == (j % 2)){
            if(i > j)
                return a;
            else
                return b;
        }
        else{
            if(i < j)
                return a;
            else
                return b;
        }
    }
}