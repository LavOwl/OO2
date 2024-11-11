package ar.edu.info.unlp.ejercicioDemo;

public class Director {
    private Constructor constructor;

    public Director(Constructor constructor){
        this.constructor = constructor;
    }

    public void buildVegetarian(){
        constructor.addIngredient(new Ingredient("Pan con semillas", 120)).addIngredient(new Ingredient("Provoleta Grillada", 200)).addIngredient(new Ingredient("Berenjenas al escabeche", 100));
    }

    public void buildClassic(){
        constructor.addIngredient(new Ingredient("Pan brioche", 100)).addIngredient(new Ingredient("Mayoneisse", 20)).addIngredient(new Ingredient("Carne de ternera", 300)).addIngredient(new Ingredient("Tomate", 80));
    }

    public void buildVegan(){
        constructor.addIngredient(new Ingredient("Pan integral", 100)).addIngredient(new Ingredient("Salchcia criolla", 20)).addIngredient(new Ingredient("Milanesa de girgolas", 500));
    }

    public void buildCapi(){
        constructor.addIngredient(new Ingredient("Pan de chipa", 150)).addIngredient(new Ingredient("Salsa tártara", 18)).addIngredient(new Ingredient("Carne de pollo", 250)).addIngredient(new Ingredient("Verduras grilladas", 200));
    }

}
