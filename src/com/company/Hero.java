package com.company;
public class Hero {

    private int Health;
    private int Damage;
    private int superAbilities;


    public Hero (int Health, int Damage, int superAbilities){
        this.Health = Health;
        this.Damage = Damage;
        this.superAbilities = superAbilities;
    }


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

    public int getSuperAbilities() {
        return superAbilities;
    }

    public void setSuperAbilities(int superAbilities) {
        this.superAbilities = superAbilities;
    }


}
