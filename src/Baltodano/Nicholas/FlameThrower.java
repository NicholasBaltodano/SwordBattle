package Baltodano.Nicholas;

public class FlameThrower implements WeaponBehavior{


    @Override
    public void useWeapon(String playerName) {
        System.out.println(playerName + " has used their Flamethrower");
        System.out.println("The enemy has been burned!");
    }

    @Override
    public void useWeapon() {
        System.out.println("Flame thrower was used!");
        System.out.println("The enemy has been incinerated!");
    }
}
