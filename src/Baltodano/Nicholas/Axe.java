package Baltodano.Nicholas;

public class Axe implements WeaponBehavior{

    // Methods
    @Override
    public void useWeapon(String playerName) {
        System.out.println("\n\n" + playerName + " has chopped with their Axe");
        System.out.println("The enemy has been attacked!");
    }

    @Override
    public void useWeapon() {
        System.out.println("The Axe was swung!");
        System.out.println("The enemy has been chopped!");
    }
}
