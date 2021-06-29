package com.company.Encapsulation;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <=0) {
            System.out.println("player knocked out");
            //reduce number of lives remaining fpr the player
        }
                    }
    public int healthRemaining(){
        return this.health;
    }





}
