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
        String choice = "";
        Boolean villagerKilled;

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


//        health = damage(health, 100, defense);
//        defense = finalDef(defense, 100);


        System.out.println("Your adventure starts now!");

        System.out.println("You see a cyanide pill in the distance.");
        System.out.println("Do you want to take it? Type y or n.");
        choice = scan.nextLine();
        if(choice.equals("y")) {
            System.out.println("You take 30,000 damage.");
            health = damage(health, 30000, defense);
            defense = finalDef(defense, 30000);
        }
        else {
            System.out.println("You decide not to take the pills and carry on.");
        }

        System.out.println("You see a man in the distance.");
        System.out.println("Type fight to fight or talk to talk");
        choice = scan.nextLine();
        if(choice.equals("fight")) {
            System.out.println("Villager: Why?");
            System.out.println("You take 10 damage.");
            health = damage(health, 10, defense);
            defense = finalDef(defense, 10);
            System.out.println("You enchant your armor with his blood: + 20 defense.");
            defense = defense  + 20;
            villagerKilled = true;
        }
        else if(choice.equals("talk")) {
            System.out.println("Villager: Thanks for not killing me dude. Here, take this!");
            System.out.println("You receive better armor. + 50 defense.");
            defense = defense  + 50;
            villagerKilled = false;
        }
        else {
            System.out.println("You decide to do nothing and you don't talk to him.");
            villagerKilled = false;
        }
    }

    public static void checkHealth(Integer health) {
        if(health <= 0) {
            System.out.println("You are dead.");
            System.exit(0);
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
        checkHealth(health);
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
