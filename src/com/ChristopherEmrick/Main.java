package com.ChristopherEmrick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Classes

        Scanner scan = new Scanner(System.in);

        String userClass= "";

        do {
            System.out.println("What class do you want to be?");
            System.out.println("Type Knight, Rouge, Archer, or Mage.");
            userClass = scan.nextLine();

            if (userClass.equals("Knight")) { // Knight class stats

            } else if (userClass.equals("Rouge")) { // Rouge class stats
                

            }
            else if (userClass.equals("Archer")) { // Archer class stats

            }
            else if (userClass.equals("Mage")) { // Mage class stats

            }
            else {
                System.out.println("That isn't one of the classes!");
            }
        } while(!(userClass.equals("Rouge") || userClass.equals("Knight") || userClass.equals("Archer") || userClass.equals("Mage")));
    }
}
