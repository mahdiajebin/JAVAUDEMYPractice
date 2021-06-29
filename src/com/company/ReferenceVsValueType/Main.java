//package com.company.ReferenceVsValueType;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    private static Scanner scanner = new Scanner (System.in);
//    public static void main(String[] args) {
////        int myIntValue = 10;
////        int anotherintvalue = myIntValue;
////
////        System.out.println("myintvlaue " +myIntValue);
////        System.out.println("another int value "  + anotherintvalue);
////        anotherintvalue++;
////        System.out.println("int v" + myIntValue );
////        System.out.println("another" + anotherintvalue);
////
////        int [] myinta = new int [5];
////        int [] anothera = myinta;
////        System.out.println("myinta " + Arrays.toString(myinta));
////        System.out.println("myintanother  " + Arrays.toString(anothera));
////        anothera[0] = 1;
////        anothera[1] = 2;
////        System.out.println(" after myinta " + Arrays.toString(myinta));
////        System.out.println("after  myintanother  " + Arrays.toString(anothera));
////        anothera = new int[] {4,5,6,7,8};
////
////       myinta = new int [] {1,2,3,4,5};
////        modifyArray(myinta);
////        System.out.println(" after modify myinta " + Arrays.toString(myinta));
////        System.out.println("after  modify myintanother  " + Arrays.toString(anothera));
////
////    }
////
////
////    private static void modifyArray(int [] array)   {
////        array [0] = 2;
////        array = new int [] {1,2,3,4,5};
//
//        //*********Minimum*****
////        System.out.println( " enter count ") ;
////        int count = scanner.nextInt();
////        scanner.nextLine();
////        int[] returnedArray = readIntegers(count);
////        int returnedMin = findMin(returnedArray);
////        System.out.println(" Min = " + returnedMin);
//        int [] array = {10, 20, 30, 60, 50};
//        reverse(array);
//   }
//
//   //  //*********Minimum*****
////
////   private static int [] readIntegers (int count) {
////        int [] array = new int[count];
////       for (int i = 0; i < array.length; i++) {
////           System.out.println("enter a numbber " );
////
////           int number = scanner.nextInt();
////           scanner.nextLine();
////           array[i] = number;
////
////       }
////        return array;
////   }
////
////   private static int findMin(int[] array){
////        int min = Integer.MAX_VALUE;
////       for (int i = 0; i < array.length; i++) {
////           int value = array[i];
////           if(value < min){
////               min = value;
////           }
////       }
////       return min;
////   }
//
//
//    //********** reverse array challenge 8***
//
//    public static void reverse(int[]  array)  {
//        //int [] reversedArray =Arrays.copyOf(array,array.length);
//        int temp = 0;
//        for (int i = 0; i < array.length/2; i++) {
//           // System.out.println("array length"array.length);
//            System.out.println("temp :" + temp);
//            System.out.println("array : " + array[i]);
//            temp = array[i];
//            System.out.println( " temp1:" + temp);
//            System.out.println( " array[i]1 :" + array[i]);
//
//            array[i] = array[array.length - i -1];//first elem
//            System.out.println( " array[i]2: " + array[i]);
//            System.out.println("array -i -12 :" + array[array.length - i -1]);
//
//            array[array.length - i -1] = temp;
//            System.out.println("array -i -1 --3:" + array[array.length - i -1]);
//            System.out.println( " temp3:" + temp);
//        }
//
//
//        for (int k = 0; k <array.length ; k++) {
//            System.out.println(array[k]);
//        }
//
//    }
//}