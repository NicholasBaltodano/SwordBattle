package Baltodano.Nicholas;

public class FlameThrower implements WeaponBehavior{

    // Methods
    @Override
    public void useWeapon(String playerName) {
        System.out.println("\n\n" + playerName + " has used their Flamethrower");
        System.out.println("The enemy has been burned!");
    }

    @Override
    public void useWeapon() {
        System.out.println("Flame thrower was used!");
        System.out.println("The enemy has been incinerated!");
    }
}
