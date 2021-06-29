//package com.company.Arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int [] integers = getIntegers(5);
//        for (int i = 0; i<integers.length; i++) {
//            System.out.println("Element " + i + " type value was " + integers[i]);
//
//
//        }
//        System.out.println(" the average is "  + getAverage(integers));
//
//
//        System.out.println(" the sorted array in decending order " + sortArray(integers));
//       // sortArray(integers);
//
//    }
//
//
//    public static int[] getIntegers(int number){
//        System.out.println(" enter " + number + "integer values.\r");
//        int[] values = new int[number];
//
//
//        for (int i=0;i <values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return (double) sum / (double) array.length;
//    }
//
//    public static int[] sortArray (int[] integers) {
////            //copy array by using own method
////        int[] sortedArray = new int [integers.length];
////        for (int i = 0; i < integers.length; i++) {
////            sortedArray[i] = integers[i];
////        }
//
//        //copying array using java built in method
//        int [] sortedArray = Arrays.copyOf(integers, integers.length);
//
//
//
//
//        for (int i = 0; i <sortedArray.length ; i++) {
//
//
//            for (int j = i+ 1; j < sortedArray.length; j++) {
//                int temp=0;
//                if(sortedArray[i]< sortedArray[j]){
//                    temp  = sortedArray[i];
//                    sortedArray[i] = sortedArray[j];
//                    sortedArray[j] = temp;
//                }
//
//            }
//
//             System.out.println(sortedArray[i]);
//
//
//        }
//
//        return  sortedArray;
//    }
//
//}
