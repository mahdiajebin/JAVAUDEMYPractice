package com.company.Composition;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int samSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int samSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.samSlots = samSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }



    public void loadProgram(String programName){
        System.out.println(" Program " + programName + " is now loading...");
    }



    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSamSlots() {
        return samSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }




}
