package Baltodano.Nicholas;

public class Sword implements WeaponBehavior{


    @Override
    public void useWeapon(String playerName) {
        System.out.println(playerName + " has swung their sword");
        System.out.println("The enemy has been attacked!");
    }

    @Override
    public void useWeapon() {
        System.out.println("The sword was swung!");
        System.out.println("The enemy has been attacked!");
    }
}
