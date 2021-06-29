//package com.company.Polymorphism;
//
//class Car {
//
//   private String carName;
//   private int cylinders;
//   private int wheels;
//   private boolean engine;
//
//    public Car(String carName, int cylinders) {
//        this.carName = carName;
//        this.cylinders = cylinders;
//        this.wheels = 4;
//        this.engine = true;
//    }
//
//    public String getCarName() {
//        return carName;
//    }
//
//    public int getCylinders() {
//        return cylinders;
//
//    }
//
//    public String startEngine(){
//        return "Engine Not found";
//    }
//
//    public String accelerate(){
//        return "Accelerating not found";
//    }
//
//    public String brake(){
//        return "braking car not found ";
//    }
//}
//
//class RangeRover extends Car {
//
////    public RangeRover() {
////        super("Range Rover", 6);
////    }
//
//
//    public RangeRover(String carName, int cylinders) {
//        super(carName, cylinders);
//    }
//
//    @Override
//    public String startEngine() {
//        return " Engine started for range rover";
//    }
//
//    @Override
//    public String accelerate() {
//        return "accelerating range rover";
//    }
//
//    @Override
//    public String brake() {
//        return "braking range rover ";
//    }
//}
//
//class MercedesBenz extends Car {
//    public MercedesBenz(String carName, int cylinders) {
//        super(carName, cylinders);
//    }
//
////    public MercedesBenz() {
////        super("Mercedes-Benz", 4);
////    }
//
//    @Override
//    public String startEngine() {
//        return getClass().getSimpleName() +" Engine started";
//    }
//
//    @Override
//    public String accelerate() {
//        return "accelerating Mercedes-Benz";
//    }
//
//    @Override
//    public String brake() {
//        return "braking Mercedes-Benz";
//    }
//}
//
//class  Infiniti  extends Car {
//
//
//    public Infiniti(String carName, int cylinders) {
//        super(carName, cylinders);
//    }
//
////    public  Infiniti () {
////        super(" Infiniti ", 6);
////    }
//
//
//    @Override
//    public String startEngine() {
//        return getClass().getSimpleName() + " start engine";
//    }
//
//    @Override
//    public String accelerate() {
//        return "accelerating Infiniti";
//    }
//
//    @Override
//    public String brake() {
//        return "braking Infiniti";
//    }
//
//}
//
//
//
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Car car = new Car("Base car", 5);
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//        System.out.println(car);
//
//        RangeRover rangerover = new RangeRover("Range rov 20cc", 6);
//        System.out.println(rangerover.accelerate());
//        System.out.println(rangerover.startEngine());
//        System.out.println(rangerover.brake());
//
//        MercedesBenz mercedes = new MercedesBenz("mercedes", 6);
//        System.out.println(mercedes.accelerate());
//        System.out.println(mercedes.startEngine());
//        System.out.println(mercedes.brake());
//    }
//
//
//
//
//
//}
