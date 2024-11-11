package ar.edu.info.unlp.ejercicioDemo;

public class Character {
    private int weapon;
    private int armor;
    private int ability;
    private int healthPoints;

    public Character(int weapon, int armor, int ability) {
        this.healthPoints = 100;
        this.weapon = weapon;
        this.armor = armor;
        this.ability = ability;
    }

    public boolean engageInCombat(Character c){
        boolean aux = (this.healthPoints > 0) && c.hit(this.weapon);

        if(aux){
            this.healthPoints -= DamageTaken.receiveDamage(c.getWeapon(), this.armor);
        }
        return aux;
    }

    public boolean hit(int offendingWeapon){
        boolean aux = this.healthPoints > 0;
        if(aux){
            this.healthPoints -= DamageTaken.receiveDamage(offendingWeapon, this.armor)
        }
        return aux;
    }

    public int getWeapon(){
        return this.weapon;
    }
}
