//package com.company.LinkedList;
//
//import javax.swing.*;
//import java.sql.SQLOutput;
//import java.util.*;
////
//public class Main {
//    //ALBUM list challange
//    private static List<Album> albums = new ArrayList<Album>();
//
//    public static void main(String[] args) {
//
//
////        Customer customer = new Customer("tim", 54.96);
////        Customer anotherCustomer;
////        anotherCustomer = customer;
////        anotherCustomer.setBalance(12.18);
////        System.out.println("Balance of customer " + customer.getName() + " is " + customer.getClass());
////
////        ArrayList<Integer> intList = new ArrayList<Integer>();
////        intList.add(1);
////        intList.add(3);
////        intList.add(4);
////
////        for (int i = 0; i < intList.size(); i++) {
////            System.out.println(i + " : " + intList.get(i)  );
////        }
////
////        System.out.println("____________________________");
////        intList.add(1,2);
////        for (int i = 0; i < intList.size(); i++) {
////            System.out.println(i + " : " + intList.get(i));
////        }
////
////
////        //********************LINKED LIST*************************//
////
////        LinkedList<String> placesToVisit = new LinkedList<String>();
////        addInOrder(placesToVisit, "Sydney");
////        addInOrder(placesToVisit, "alabama");
////        addInOrder(placesToVisit, "darwin");
////        addInOrder(placesToVisit, "adelaide");
////        addInOrder(placesToVisit, "perth");
////        addInOrder(placesToVisit, "bristol");
////
////        printList(placesToVisit);
////        addInOrder(placesToVisit, "swiss");
////        addInOrder(placesToVisit, "darwin");
////        printList(placesToVisit);
////        visit(placesToVisit);
////
////
////
////
//
//        Album album = new Album("stormbringer", " deep pruple");
//        album.addSong("Stormbringer", 4.6);
//        album.addSong("Love dont mean a thing", 4.8);
//        album.addSong("Holy man", 4.0);
//        album.addSong("Hold on", 4.7);
//        album.addSong("Lady double dealer", 4.8);
//        album.addSong("You can't do it right", 4.4);
//        album.addSong("Soldier of fortune", 4.7);
//        album.addSong("Not doing it again", 4.6);
//        albums.add(album);
//
//        album = new Album("For those about to rock", "AC/DC");
//        album.addSong("For those about to rock ", 4.5);
//        album.addSong("A ", 4.5);
//        album.addSong("B ", 4.5);
//        album.addSong("C ", 4.5);
//        album.addSong("D ", 4.5);
//        album.addSong("E", 4.5);
//        album.addSong("F", 4.5);
//        albums.add(album);
//
//
//        List<Song> playList = new ArrayList<Song>();
//        //  albums.get(0).addToPlayList("Which song?",which list);
//        albums.get(0).addToPlayList("Stormbringer", playList);
//        albums.get(0).addToPlayList("Holy man", playList);
//        albums.get(0).addToPlayList("Speed King", playList);
//        albums.get(0).addToPlayList(3, playList);
//        albums.get(1).addToPlayList(7, playList);
//        albums.get(1).addToPlayList(24, playList);
//
//        play(playList);
//
//    }
//
//
//
//    //main2}
////
////    private static void printList(LinkedList<String> linkedList){
////        Iterator<String> i = linkedList.iterator();
////        while (i.hasNext()) {
////            System.out.println("Now visiting " + i.next());
////        }
////        System.out.println("======================");
////    }
////
////    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
////        ListIterator<String> stringListIterator = linkedList.listIterator();
////
////        while (stringListIterator.hasNext()) {
////            int comparison = stringListIterator.next().compareToIgnoreCase(newCity);
////            if(comparison == 0){
////                //do not add
////                System.out.println(newCity + " is already included in the list");
////                return false;
////            }else if(comparison > 0) {
////                // new city should appear before this one
////                //Brisbane -> adelaide
////                //move back to previews because .next moved to next one
////
////                stringListIterator.previous();
////                stringListIterator.add(newCity);
////                return true;
////            }else if (comparison < 0 ) {
////                //move to next city
////
////            }
////        }
////        stringListIterator.add(newCity);
////        return true;
////    }
////
////    private static void visit(LinkedList cities) {
////        Scanner scanner = new Scanner(System.in);
////        boolean quit = false;
////        boolean goingForward = true;
////        ListIterator<String> listIterator = cities.listIterator();
////
////        if (cities.isEmpty()) {
////            System.out.println("No cities in the itenary");
////            return;
////        } else {
////            System.out.println("Now visiting " + listIterator.next());
////            printMenu();
////        }
////
////        while (!quit) {
////            int action = scanner.nextInt();
////            scanner.nextLine();
////            switch (action) {
////                case 0:
////                    System.out.println("vac over");
////                    quit = true;
////                    break;
////                case 1:
////                    if(!goingForward){
////                       if(listIterator.hasNext()) {
////                           listIterator.next();
////                       }
////                       goingForward = true;
////                    }
////                    if(listIterator.hasNext()) {
////                        System.out.println("Now visiting " + listIterator.next());
////                    }else {
////                        System.out.println(" reached the end of the list");
////                        goingForward = false;
////                    }
////                    break;
////
////                case 2:
////                    if(goingForward){
////                        if(listIterator.hasPrevious()){
////                            listIterator.previous();
////                        }
////                        goingForward = false;
////                    }
////
////                    if(listIterator.hasPrevious()) {
////                        System.out.println("Now visiting " + listIterator.previous());
////                    }else {
////                        System.out.println(" we are at the start of the list");
////                        goingForward = true;
////                    }
////                    break;
////
////                case 3:
////                    printMenu();
////                    break;
////            }
////        }
////    }
////
////    private  static void printMenu(){
////        System.out.println("avialable options: \npress");
////        System.out.println(" 0 - to quit\b" + " 1- go to next city\n" + "2- go to previews city " + "3-print menu options"  );
////
//
//
//    //PLAY method
//    private static void play(List<Song> playlist) {
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        boolean forward = true;
//        ListIterator<Song> listIterator = playlist.listIterator();
//        if(playlist.size() == 0) {
//            System.out.println(" No songs in playlist");
//        }else {
//            //we have to have a toString method because in this example we are using song object instead of String
//            System.out.println("Now playing " + listIterator.next().toString());
//            printMenu();
//        }
//
//    while (!quit) {
//
//        int action = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (action) {
//            case 0:
//                System.out.println(" playlist complete");
//                quit = true;
//                break;
//            case 1:
//                if(!forward){
//                       if(listIterator.hasNext()) {
//                           listIterator.next();
//                       }
//                       forward = true;
//                    }
//                    if(listIterator.hasNext()) {
//                        System.out.println("Now playing " + listIterator.next().toString());
//                    }else {
//                        System.out.println(" reached the end of the list");
//                        forward = false;
//                    }
//
//                break;
//            case 2:
//                if(forward){
//                        if(listIterator.hasPrevious()){
//                            listIterator.previous();
//                        }
//                        forward = false;
//                    }
//
//                    if(listIterator.hasPrevious()) {
//                        System.out.println("Now playing " + listIterator.previous().toString());
//                    }else {
//                        System.out.println(" we are at the start of the list");
//                        forward = true;
//                    }
//                break;
//            case 3:
//                if(forward){
//                    if(listIterator.hasPrevious()){
//                        System.out.println("now replaying " + listIterator.previous());
//                        forward = false;
//                    }else {
//                        System.out.println("we are at the start of the list");
//                    }
//                }else {
//                   if(listIterator.hasNext()) {
//                       System.out.println(" now playing " + listIterator.next());
//                       forward = true;
//                   }else {
//                       System.out.println(" we are at the end of the list");
//                   }
//                }
//                break;
//            case 4:
//               printList(playlist);
//                break;
//            case 5:
//                printMenu();
//                break;
//            case 6:
//                if(playlist.size() > 0 ){
//                    listIterator.remove();
//                    if(listIterator.hasNext()){
//                        System.out.println("Now playing " + listIterator.next());
//                    }else if(listIterator.hasPrevious()){
//                        System.out.println("Now playing " + listIterator.previous());
//                    }
//                }
//                break;
//        }
//
//    }
//
//    }
//
//    private static void printMenu(){
//        System.out.println("Avialable action :\nPress");
//        System.out.println("0 - to quit\n" + "1- go to next song\n" + "2- go to previews song\n" + "3-Replay current song\n" + "4-List the songs in the playlist\n" + "5-print avialable actions\n" + "6-delete current song from playlist");
//    }
//
//    private static void printList(List<Song> playlist){
//        //regular iterator just for going forward and list iterator allows you to go backward and forward.
//        Iterator<Song> iterator = playlist.iterator();
//        System.out.println("=======================");
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().toString());
//        }
//        System.out.println("=======================");
//
//    }
//
//
//
// // }
//}
