package com.internshala.javabasics;

public class StringExp1 {
    public static void main(String[] args){
        //using literals to create Strings
            String firstString="welcome";//s1
            String secondString="welcome";//s1

        //using new keyword
            String thirdString=new String("welcome");//s2
        //compare two objects
        System.out.println(firstString == secondString);//true
        System.out.println(firstString == thirdString);//false
        //comparing of two values
        System.out.println(firstString.equals(thirdString));//true



    }
}
