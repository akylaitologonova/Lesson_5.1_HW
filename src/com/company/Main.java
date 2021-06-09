package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero Superman = new Hero ( 250, 50, 60);

        System.out.println(Superman.getHealth() + " " +
                Superman.getDamage() + " " + Superman.getSuperAbilities());


        Boss Ultraman  = new Boss ( 300, 80, 40);

        System.out.println(Ultraman.getHealth() + " " +
                Ultraman.getDamage() + " " + Ultraman.getProtect());


    }
}
