package com.internshala.javabasics;

public class LogicalOperator {
    public static void main(String args[]) {

        System.out.println(true);
        System.out.println(!true);

        System.out.println(true && false);

        boolean x= 4>10; // false
        boolean y= 100>45;  //true
        System.out.println(x || y);
        System.out.println(!(x || y));


    }
}
