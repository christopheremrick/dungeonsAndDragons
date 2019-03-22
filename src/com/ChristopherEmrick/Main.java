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

//      Template for 100 damage
//        health = damage(health, 100, defense);
//        defense = finalDef(defense, 100);
//        System.out.println("You have " + health);
//        System.out.println("You have " + defense);

    }

    public static void checkHealth(Integer health) {
        if(health <= 0) {
            System.out.println("You are dead.");
        }
        else {
            return;
        }
    }
    public static Integer damage(Integer health, Integer damage, Integer defense) {

        if(doArmorCalc(defense, damage) < 0){ // if armor is less than 0, we add negative armor from health to get damage not absorbed
            health = health + doArmorCalc(defense, damage);
        }
        else {
            health = health;
        }
        return health;
    }
    public static Integer doArmorCalc(Integer defense, Integer damage) { // 150, 100, returns 50
            return defense - damage;
    }
    public static Integer finalDef(Integer defense, Integer damage) {
        if(doArmorCalc(defense, damage) > 0) {
            return doArmorCalc(defense, damage);
        }
        else {
            return 0;
        }
    }
}
