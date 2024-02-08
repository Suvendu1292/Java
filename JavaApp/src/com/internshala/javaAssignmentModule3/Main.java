package com.internshala.javaAssignmentModule3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Cake cake1 = new Cake();
        cake1.setName("Chocolate Brownie");
        cake1.setPrice(250);

        Cake cake2 = new Cake();
        cake2.setName("Chocolate Maple");
        cake2.setPrice(300);

        List<Cake> cakesList = new ArrayList<>();
        cakesList.add(cake1);
        cakesList.add(cake2);

        Pastry pastry1 = new Pastry();
        pastry1.setName("Black Forest");
        pastry1.setPrice(35);

        Pastry pastry2= new Pastry();
        pastry2.setName("Choco Truffle");
        pastry2.setPrice(40);

        List<Pastry> pastrysList = new ArrayList<>();
        pastrysList.add(pastry1);
        pastrysList.add(pastry2);

        System.out.println("   Today's Special Menu      ");
        System.out.println("-----------------------------------------");

        System.out.println();
        System.out.println("  Special Cakes");
        System.out.println("  -------------------------------");

        //for each loop for Cake ArrayList
        for (Cake cake: cakesList) {
            cake.display();
        }

        System.out.println();
        System.out.println("  Special Pastries");
        System.out.println("  -------------------------------");

        //for each loop for Pastry ArrayList
        for (Pastry pastry: pastrysList) {
            pastry.display();
        }


    }
}
