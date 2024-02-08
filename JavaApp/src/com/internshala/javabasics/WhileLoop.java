package com.internshala.javabasics;

public class WhileLoop {
    public static void main(String args[]){
        //write a program to print natural numbers till 10      0,1,2.....,10

        int count=0;
        while(count<=10){
            System.out.println(count);
            count++;
        }
        System.out.println("================");
        //WAP to find factorial of a number
        // factorial of 5 is 5 * 4 * 3 *2 *1=120

        int num=5;
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
