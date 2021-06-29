//package com.company.MainClass;
//
//import com.company.Composition.*;
//import com.company.Encapsulation.EnhancedPlayer;
//import com.company.Encapsulation.Player;
//import com.company.Encapsulation.Printer;
//import com.company.Inheritance.Animal;
//import com.company.Inheritance.Dog;
//import com.company.Inheritance.Outlander;
//import com.company.Polymorphism.IndependenceDay;
//import com.company.Polymorphism.Jaws;
//import com.company.Polymorphism.Movie;
//
//import java.awt.*;
//import java.util.Calendar;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here\\
//
////        for (int i = 0; i <5; i++){
////            System.out.println("loop " + i + " hello");
////        }
////
////        for (int i = 8; i >= 2; i--){
////            System.out.println(" 10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
////        }
////        int count = 0;
////
////        for (int i = 10; i <50; i++){
////
////          if (isPrime(i)) {
////              count ++;
////              System.out.println("prime numbers " + i );
////              if (count == 10  ){
////                  break;
////              }
////
////
////          }
////
////        }
//                                  //****Object orientated programming*********//
//
////        Car porshe = new Car();
////        Car holden = new Car();
////        porshe.setModel("911");
////        System.out.println("model is " + porshe.getModel());
//     //   BankAccount BobsAccount = new BankAccount("234343", 3445.0, "Bob the Builder", "bobzy@buildermail.com", "(456)-454-2453");
////        BankAccount BobsAccount = new BankAccount();
////        BankAccount AkinsAccount = new BankAccount();
////        AkinsAccount.deposit(50);
////        AkinsAccount.withdrawal(100);
////        AkinsAccount.deposit(51);
////        AkinsAccount.withdrawal(100);
////
////        System.out.println(BobsAccount.getAccountNumber());
////        System.out.println(BobsAccount.getCustomerName());
////        System.out.println(BobsAccount.getBalance());
////
////        BankAccount TimsAccount = new BankAccount("TIM", "time@mail.com", "123-456-7890");
////        System.out.println(TimsAccount.getAccountNumber() + " name " + TimsAccount.getCustomerName());
//
//
//                                              //*****INHERITANCE*******////
////        Animal animal = new Animal("animal", 1,1,5,5);
////
////        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long silky");
//
//      //  dog.eat();
//   //     dog.walk();
//      //  dog.run();
//        //challenge
////        Outlander outlander = new Outlander(36);
////        outlander.steer(45);
////        outlander.accelerate(30);
////
////        outlander.accelerate(20);
////        outlander.accelerate(-42);
//
//
//        //************COMPOSITION*************//
//
////        Dimensions dimensions = new Dimensions(20,20,5);
////
////        Case theCase = new Case("220B",  "DELL", "240", dimensions );
////
////        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));
////
////        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
////
////
////        PC thePC = new PC(theCase,monitor,motherboard);
////
////        thePC.PowerUp();
//
//
//                //*********ENCAPSULATION***************///
//
////        Player player = new Player();
////        player.name = "akin";
////        player.health = 20;
////        player.weapon = "sword";
////
////
////        int damage = 10;
////        player.loseHealth(damage);
////
////        System.out.println(" REMAING HEALTH IS " + player.healthRemaining());
////        damage = 11;
////        player.loseHealth(damage);
////
////        System.out.println(" REMAING HEALTH IS " + player.healthRemaining());
//
//
////        EnhancedPlayer player = new EnhancedPlayer("akin",200,"Sword");
////        System.out.println("Initial health is " + player.getHealth());
////
////        //printer
////        Printer printer = new Printer(50,true);
////        System.out.println(" initial pages count = " + printer.getPagesPrinted());
////        int pagesPrinted = printer.printPages(4);
////        System.out.println("pages printed was " + pagesPrinted + " new total  = " + printer.getPagesPrinted()  );
////        pagesPrinted = printer.printPages(2);
////
////        System.out.println("pages printed was " + pagesPrinted + " new total  = " + printer.getPagesPrinted()  );
//
//
//
//
//        //**********POLYMORPHISM********//
//        //PLOT
//
//
//
//
//
//    }  //end of main
//
//
//    //
//
//    //**********POLYMORPHISM Method********//
////    public static Movie randomMovie() {
////        int randomNumber = (int) (Math.random() * 5 + 1);
////        System.out.println("random number generated was : " + randomNumber);
////        switch (randomNumber) {
////            case 1:
////                return new Jaws();
////                break;
////            case 2:
////                return new IndependenceDay();
////                break;
////        }
////    }
//
//
//
//
////
////public static long depositFunds(long newDeposit, long initialBankBalace) {
////
////    return newDeposit + initialBankBalace;
////
////
////}
//
////public static long withdrawFund
//
//
//
//
//
//
//
//
//
//
//
////    public static boolean isPrime(int n){
////        if(n==1) {
////            return false;
////        }
////        for (int i = 2; i< n/2; i++){
////            if(n % i == 0){
////                return false;
////            }
////        }
////        return true;
////    }
////
////
////    public static double calculateInterest(double amount, double interstRate){
////
////        return (amount *(interstRate/100));
////    }
////
//}
