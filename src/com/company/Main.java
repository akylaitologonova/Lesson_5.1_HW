package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Hero superman = new Hero(250, 50, 80);


        System.out.println(superman.getHealth() + " " +
                superman.getDamage() + " " + superman.getSuperAbilities());


        Boss ultraman  = new Boss(400, 80, 0);


        System.out.println(ultraman.getHealth() + " " +
                ultraman.getDamage() + " " + ultraman.getProtect());


    }
}
