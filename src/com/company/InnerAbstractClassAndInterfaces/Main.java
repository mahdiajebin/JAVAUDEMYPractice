package com.company.InnerAbstractClassAndInterfaces;
//
import org.w3c.dom.html.HTMLImageElement;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

//
public class Main {
    public static void main(String[] args) {
//        ITelephone timsphone;
//        timsphone = new DeskPhone(123456);
//        timsphone.powerOn();
//        timsphone.callPhone(123456);
//        timsphone.answer();
//
//        timsphone = new MobilePhone(24656);
//        //timsphone.powerOn();
//        timsphone.callPhone(24565);
//        timsphone.answer();
//
            Player tim = new Player("Tim",10,15);
            System.out.println(tim.toString());
            saveObject(tim);
            tim.setHitPoints(8);
            System.out.println(tim);
            tim.setWeapon("stormbringer");
            saveObject(tim);
        //    loadObject(tim);
            System.out.println(tim);


            ISaveable warewolf = new Monster("Warewolf", 20, 40);
            System.out.println(warewolf);
            saveObject(warewolf);

   }
public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
        "1 to enter a string\n" +
        "0 to quit");

        while (!quit) {
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
        case 0:
        quit = true;
        break;
        case 1:
        System.out.print("Enter a string: ");
        String stringInput = scanner.nextLine();
        values.add(index, stringInput);
        index++;
        break;
        }
        }
        return values;
        }

        public static void saveObject(ISaveable objectToSave){
                for (int i = 0; i < objectToSave.write().size(); i++) {
                        System.out.println("saving " + objectToSave.write().get(i) + " to storage device");
                }
        }

public static void loadObject(ISaveable objectToLoad){
            ArrayList<String> values = readValues();
            objectToLoad.read(values);
}


}
