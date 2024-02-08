package com.internshala.javabasics;

//Write a Program for simple interest
// SI= principal * rateOfInterest * timePeriod / 100

public class MethodsExp1 {
    public static void main(String[] args){
        //user1
        calculateSimpleInterest(1000,4.6f,2);
        //user2
        calculateSimpleInterest(2000,3.8f,4);
    }
    public static void calculateSimpleInterest(int principal,float rateOfInterest,int timePeriod){
        double simpleInterest=principal*rateOfInterest*timePeriod / 100;
        System.out.println("Simple Interest is = "+ simpleInterest);

    }
}
