package com.ChristopherEmrick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Classes

        Scanner scan = new Scanner(System.in);

        String userClass= "";
        Integer health = 0;
        Integer defense = 0;
        Integer mana = 0;

        do {
            System.out.println("What class do you want to be?");
            System.out.println("Type Knight, Rouge, Archer, or Mage.");
            userClass = scan.nextLine();

            if (userClass.equals("Knight")) { // Knight class stats
                health = 150;
                defense = 150;
                mana = 0;

            }
            else if (userClass.equals("Rouge")) { // Rouge class stats
                health = 50;
                defense = 50;
                mana = 0;

            }
            else if (userClass.equals("Archer")) { // Archer class stats
                health = 100;
                defense = 100;
                mana = 0;

            }
            else if (userClass.equals("Mage")) { // Mage class stats
                health = 50;
                defense = 50;
                mana = 100;

            }
            else {
                System.out.println("That isn't one of the classes!");
            }
        } while(!(userClass.equals("Rouge") || userClass.equals("Knight") || userClass.equals("Archer") || userClass.equals("Mage")));
    }

    public static void checkHealth(Integer health) {
        if(health <= 0) {
            System.out.println("You are dead.");
            return;
        }
    }
}
