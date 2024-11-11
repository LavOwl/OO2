package ar.edu.info.unlp.ejercicioDemo;

public class CharacterConstructor {
    private int weapon;
    private int armor;
    private int ability;

    public Character create(){
        return new Character(weapon, armor, ability);
    }

    public CharacterConstructor weapon(int weapon){
        this.weapon = weapon;
        return this;
    }

    public CharacterConstructor armor(int armor){
        this.armor = armor;
        return this;
    }

    public CharacterConstructor ability(int ability){
        this.ability = ability;
        return this;
    }
}