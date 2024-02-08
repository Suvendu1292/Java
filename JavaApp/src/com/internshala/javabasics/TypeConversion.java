package com.internshala.javabasics;

public class TypeConversion {

    public static void main(String args[]){

        //implicit conversion
                int radius=400;
                double newRadius= radius;
                System.out.println(newRadius);


        //explicit conversion
                double diameter=3.78;
               // int newDiameter = diameter;
                int newDiameter =(int) diameter;
                System.out.println(newDiameter);






    }
}
