package ar.edu.info.unlp.ejercicioDemo;


public class DamageTaken {
    private static int[][] damageToTake;

    public static int receiveDamage(int weapon, int armor){
        try{
            return damageToTake[weapon][armor];
        }
        catch(Exception e){
            return 0;
        }
    }

    public static void initialize(int[][] matrix){
        damageToTake = matrix;
    }
}
