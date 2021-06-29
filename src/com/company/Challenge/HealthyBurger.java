package com.company.Challenge;

public class HealthyBurger extends Burger {
    private String healthyextra1Name;
    private double healthyextra1Price;

    private String healthyextra2Name;
    private double healthyextra2Price;

    public HealthyBurger(String pattyType, double price) {
        super("Healthy ", "brown rye", pattyType, price);
    }

    public void addhealthAddition1(String name, double price) {
        this.healthyextra1Name = name;
        this.healthyextra1Price = price;
    }
    public void addhealthAddition2(String name, double price) {
        this.healthyextra2Name = name;
        this.healthyextra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
             double burgerPrice =  super.itemizeHamburger();
             if(this.healthyextra1Name != null) {
                 burgerPrice += this.healthyextra1Price;
                 System.out.println(" aDDED " + this.healthyextra1Name + " for an extra " + this.healthyextra1Price);
             } if(this.healthyextra1Name != null) {
            burgerPrice += this.healthyextra2Price;
            System.out.println(" aDDED " + this.healthyextra2Name + " for an extra " + this.healthyextra2Price);
        }
     return burgerPrice;
    }
}
