package com.ChristopherEmrick;

public class Fight {

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
    public static Integer doEnemyDamage(Integer enemyHealth, Integer damage) {
        System.out.println("You deal " + damage + " damage.");
        System.out.println("It has " + (enemyHealth- damage) + "/" + enemyHealth + " health.");
        return enemyHealth - damage;
    }
    public static Integer dodgeOrDamage(Integer speed, Integer health, Integer attack, Integer enemyDamage, Integer enemyHealth) {
        Double dodgeChance = (speed * (Double) (Math.random()));
        System.out.println(dodgeChance);
            if (dodgeChance > 50) { // Dodges
                dodge();
                return health;
            } else if (dodgeChance < 50) { // Dodge fails
                health = damage(health, enemyDamage, 0);
                System.out.println("You take " + (health - damage(health, enemyDamage, 0)) + " damage.");
                return health;
            }
            return health;
    }
    public static void dodge(){
        System.out.println("You dodged!");
    }
    public static Boolean doDodge(String fightChoice) {
        if(fightChoice.equals("dodge")) {
            return true;
        }
        else {
            return false;
        }
    }
}
