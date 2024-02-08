package com.internshala.javabasics;
/* WAP to find out factorial of 9 using WHILE Loop */

public class CodingPractice2 {
    public static void main(String args[]){
        int num=9;
        int temp;
        temp=num;
        long factorial=1;
        while(num>0){
            factorial=factorial*num; // factorial=1*5=5
            num--;
        }
        System.out.println("Factorial of "+temp +" is : "+ factorial);
    }
}
