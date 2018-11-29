package Baltodano.Nicholas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create the player and get their weapon selection
        Player player = new Player();
        selectWeapon(player);

        // Start a fight
        player.fight();

        endGame();
    }


    // Gets input from the user to select their weapon choice
    private static char getWeaponChoice(){

        // Variables
        Scanner scanner = new Scanner(System.in);
        String  input;
        char    choice;
        boolean selectionNotMade = true;

        // Get valid input from the user.
        do {
            System.out.println("Please choose your weapon!");
            System.out.println("S - Sword");
            System.out.println("A - Axe");
            System.out.println("F - Flame Thrower");
            System.out.println("==========================");
            System.out.print("Please enter your choice: ");

            input = scanner.nextLine().toLowerCase();
            choice = input.charAt(0);

            if(choice == 's' || choice == 'a' || choice == 'f')
                selectionNotMade = false;
            else
                System.out.println("\n\nPlease select a valid choice!");

        }while (selectionNotMade);

        return choice;
    }

    // This assign the user their weapon choice.
    private static void selectWeapon(Player player){
        switch (getWeaponChoice()){
            case 's':
                player.setWeapon(new Sword());
                break;
            case 'f':
                player.setWeapon(new FlameThrower());
                break;
            case 'a':
                player.setWeapon(new Axe());
                break;
            default:
                System.out.println("Possible error");
        }
    }

    // End the game with a message
    private static void endGame(){
        System.out.println("\n\nCongratulations! You have defeated your enemy.");
        System.out.println("Thank you for running this game ;D");
    }
}

