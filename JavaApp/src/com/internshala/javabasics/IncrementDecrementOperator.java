package com.internshala.javabasics;

public class IncrementDecrementOperator {
    public static void main(String args[]){

        //postfix increment
        int year=20;
        int newYear=year++;
        System.out.println("Year is : "+ year);
        System.out.println("newYear is : "+ newYear);

        int age=10;
        System.out.println("Age is : "+ age++);
        System.out.println("After Postfix increment age value is : "+ age);

        System.out.println("After prefix increment of age the the value is : "+ ++age);
        System.out.println("Age is : "+ age);

        //age=12;
        System.out.println(age++ + ++age); //12+14


    }
}
