package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ConcreteConstructor implements Constructor {
    List<Ingredient> ingredients;

    public ConcreteConstructor(){
        this.ingredients = new ArrayList<Ingredient>();
    }

    public Constructor addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
        return this;
    }

    public Sandwich construct(){
        return new Sandwich(this.ingredients);
    }
}
