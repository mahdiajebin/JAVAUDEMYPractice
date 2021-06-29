package com.company.Inheritance;

public class Car extends Vehicle{

    private int wheel;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;


    public Car(String name, String size, int wheel, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheel = wheel;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setcurrentgear(); changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println(" car.changevelocity(); Velocity " + speed + " direction " + direction);

        move(speed,direction);

    }


}
