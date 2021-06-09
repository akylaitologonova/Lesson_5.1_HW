package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero Superman = new Hero(250, 50, 80);


        System.out.println(Superman.getHealth() + " " +
                Superman.getDamage() + " " + Superman.getSuperAbilities());


        Boss Ultraman  = new Boss(400, 80, 70);



        System.out.println(Ultraman.getHealth() + " " +
                Ultraman.getDamage() + " " + Ultraman.getProtect());


    }
}
