package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero Superman = new Hero();
        Superman.setHealth(250);
        Superman.setDamage(50);
        Superman.setSuperAbilities(80);

        System.out.println(Superman.getHealth() + " " +
                Superman.getDamage() + " " + Superman.getSuperAbilities());


        Boss Ultraman  = new Boss();
        Ultraman.setHealth(400);
        Ultraman.setDamage(80);
        Ultraman.getProtect(70);


        System.out.println(Ultraman.getHealth() + " " +
                Ultraman.getDamage() + " " + Ultraman.getProtect());


    }
}
