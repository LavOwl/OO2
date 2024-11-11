package ar.edu.info.unlp.ejercicioDemo;

public class Director {
    private CharacterConstructor cc;
    
    public Director(CharacterConstructor cc, int[][] matrix){
        this.cc = cc;
        DamageTaken.initialize(matrix);
    }

    public Character createWizard(){
        return cc.weapon(2).armor(2).ability(2).create();
    }

    public Character createWarrior(){
        return cc.weapon(0).armor(0).ability(0).create();
    }

    public Character createArcher(){
        return cc.weapon(1).armor(2).ability(1).create();
    }

    public Character createThoor(){
        return cc.weapon(3).armor(1).ability(3).create();
    }
}
