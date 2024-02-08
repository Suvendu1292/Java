package com.internshala.javabasics;

//WAP to add number until the user enters Zero

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        int num=0;
        int sum=0;
        do{
            System.out.println("Enter a number : ");
            num=scn.nextInt();
            sum+=num;
        }while(num!=0);
        System.out.println("Sum is : "+sum);

    }
}
