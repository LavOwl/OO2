package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private List<Ingredient> ingredients;

    public Sandwich(List<Ingredient> ingredients){
        this.ingredients = new ArrayList<Ingredient>(ingredients);
    }

    public List<Ingredient> getIngredients(){
        return new ArrayList<Ingredient>(this.ingredients);
    }
}
