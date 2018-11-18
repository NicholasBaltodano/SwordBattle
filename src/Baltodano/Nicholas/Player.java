package Baltodano.Nicholas;

public class Player extends Character {

    //Variables
    String name;

    // Constructor
    Player() {
       name = "player";
    }

    // Methods
    @Override
    public void fight(){
       weapon.useWeapon(this.name);
    }
}
