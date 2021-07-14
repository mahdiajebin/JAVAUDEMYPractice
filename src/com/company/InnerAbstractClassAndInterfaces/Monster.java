package com.company.InnerAbstractClassAndInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
       ArrayList<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savesValues) {
        if(savesValues != null && savesValues.size() > 0){
            this.name = savesValues.get(0);
            this.hitPoints = Integer.parseInt(savesValues.get(1));
            this.strength = Integer.parseInt(savesValues.get(2));

        }
    }
}
