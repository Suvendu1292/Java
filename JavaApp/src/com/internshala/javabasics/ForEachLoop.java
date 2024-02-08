package com.internshala.javabasics;
/* FOR EACH Loop Practice */

// Define a double array and use For Each loop
// to find the sum of all the numbers stored in the array.

public class ForEachLoop {
    public static void main(String[] args){
        double[] newDoubleArray={22.6d,34.3d,12.5d};
        System.out.println(newDoubleArray[1]);
        System.out.println(newDoubleArray.length);
        System.out.println("=================");
        double sumOfElements=0d;
        for (double num:newDoubleArray) {
            sumOfElements+=num;
            System.out.println(num);
        }
        System.out.println("Sum of element is : "+sumOfElements);
    }
}
