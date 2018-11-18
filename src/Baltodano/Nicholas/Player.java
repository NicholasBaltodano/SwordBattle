package Baltodano.Nicholas;

public class Player extends Character {

    String name;

    Player() {
       name = "player";
    }

    @Override
    public void fight(){
       weapon.useWeapon(this.name);
    }
}
