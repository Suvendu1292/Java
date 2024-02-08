package com.internshala.javabasics;
import java.util.Scanner;

public class CodeChallenge2 {
    public static void main(String args[]){
        String name;
        int age;

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        name=scn.nextLine();
        System.out.println("Enter your Age : ");
        age=scn.nextInt();

        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
}
