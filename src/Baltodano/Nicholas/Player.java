package Baltodano.Nicholas;

public class Player extends Character {

    // Variables
    private String name;

    // Constructor
    Player() {
       name = "Player";
    }

    // Methods
    @Override
    public void fight(){
       weapon.useWeapon(this.name);
    }
}
