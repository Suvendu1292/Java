package com.internshala.javabasics;
import java.util.Scanner;
public class InputCheck {
    public static void main(String args[]){

        String name;
        int population;
        float populationDensity;
        double gdp;
        char currency;
        boolean isSecular;

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter Your Country Name : ");
        name=scn.nextLine();

        System.out.println("Enter Population : ");
        population=scn.nextInt();

        System.out.println("Enter currency Symbol: ");
        currency=scn.next().charAt(0);

        System.out.println("Country Name is : " +name);
        System.out.println("Population is : " +population);
        System.out.println("Currency symbol is :"+currency);







    }
}
