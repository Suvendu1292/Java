package com.internshala.javabasics;

public class MethodExp2 {
    public static void main(String[] args){
        //user1
        double si1=calculateSimpleInterest(1000,4.6f,2);
        System.out.println(si1);
        //user2
        double si2=calculateSimpleInterest(2000,3.8f,4);
        System.out.println(si2);
    }
    public static double calculateSimpleInterest(int principal,float rateOfInterest,int timePeriod){
        double simpleInterest=principal*rateOfInterest*timePeriod / 100;
        return simpleInterest;


    }
}
