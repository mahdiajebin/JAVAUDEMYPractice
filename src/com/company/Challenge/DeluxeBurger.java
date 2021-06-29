package com.company.Challenge;

public class DeluxeBurger extends Burger{
///prevent the user from adding extra additional items
    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("cannot add additional item to deluxe burger");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("cannot add additional item to deluxe burger");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("cannot add additional item to deluxe burger");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("cannot add additional item to deluxe burger");
    }

    public DeluxeBurger() {

        super("Deluxe", "white", "beef", 14.54);
        super.addBurgerAddition1("chips",2.75);
        super.addBurgerAddition2("Soda", 1.00);

    }
}
