package com.company;

public class Boss {

    int Health;
    int Damage;
    int Protect;

    public Boss (int Health, int Damage, int Protect){
        this.Health = Health;
        this.Damage = Damage;
        this.Protect = Protect;}

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getProtect() {
        return Protect;
    }

    public void setProtect(int protect) {
        Protect = protect;
    }
    public static void changeBossDefence(){}
       }
