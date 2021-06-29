package com.company.Challenge;

public class Burger {
    private String name;
    private String breadType;
    private String pattyType;
    private double price;

    //
    private String itemName1;
    private double itemPrice1;
    private String itemName2;
    private double itemPrice2;
    private String itemName3;
    private double itemPrice3;
    private String itemName4;
    private double itemPrice4;


    public Burger(String name, String breadType, String pattyType, double price) {
        this.name = name;
        this.breadType = breadType;
        this.pattyType = pattyType;
        this.price = price;

    }



    public void addBurgerAddition1(String name, double price) {
        this.itemName1 = name;
        this.itemPrice1 = price;

    }

    public void addBurgerAddition2(String name, double price) {
        this.itemName2 = name;
        this.itemPrice2 = price;

    }

    public void addBurgerAddition3(String name, double price) {
        this.itemName3 = name;
        this.itemPrice3 = price;

    }

    public void addBurgerAddition4(String name, double price) {
        this.itemName4 = name;
        this.itemPrice4 = price;

    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " burger" + " on a " + this.breadType + " roll " + "with " + this.pattyType
                + " price is " + this.price);

        if (this.itemName1 != null) {
            hamburgerPrice += this.itemPrice1;
            System.out.println("added " + this.itemName1 + " for an extra " + this.itemPrice1);
        }

        if (this.itemName2 != null) {
            hamburgerPrice += this.itemPrice2;
            System.out.println("added " + this.itemName2 + " for an extra " + this.itemPrice2);
        }
        if (this.itemName3 != null) {
            hamburgerPrice += this.itemPrice3;
            System.out.println("added " + this.itemName3 + " for an extra " + this.itemPrice3);
        }
        if (this.itemName4!= null) {
            hamburgerPrice += this.itemPrice4;
            System.out.println("added " + this.itemName4 + " for an extra " + this.itemPrice4);
        }

    return hamburgerPrice;
    }

}






