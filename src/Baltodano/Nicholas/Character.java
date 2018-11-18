package Baltodano.Nicholas;

public abstract class Character {

    // Variables
    WeaponBehavior weapon;

    // Methods

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }


    public void fight(){
        weapon.useWeapon();
    }

}
