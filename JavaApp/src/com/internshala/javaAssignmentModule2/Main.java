package com.internshala.javaAssignmentModule2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME------");
        System.out.println( );
        //Initialize Scanner class obj
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter total person count");
        int count=scanner.nextInt();
        System.out.println( );

        String[] nameArray=new String[count];
        long[] incomeArray=new long[count];

         for(int i=0; i<count;i++ ){
             System.out.println("Enter name "+ (i+1) +": ");
             nameArray[i]=scanner.next();
             System.out.println("Enter "+nameArray[i] +"'s Annual Income : ");
             incomeArray[i]=scanner.nextLong();

         }//end of for loop
        System.out.println( );
        System.out.println(" Names with liable taxes");
        System.out.println("---------------------------");

        for(int i=0;i < count ; i++){
            calculateTax(nameArray[i],incomeArray[i]);
        }

    }//end of main(-) method
    private static void calculateTax(String name,long income){
        long tax;
        if(income>=300000){
            tax=income * 20/100;
        }else if(income>=100000 && income<=300000){
            tax=income * 10/100;
        }else{
            tax=0;
        }
        System.out.println(name +" : "+ '\u20B9' + " " + tax);
    }//end of calculateTax(-,-) method

}//end of Main class
