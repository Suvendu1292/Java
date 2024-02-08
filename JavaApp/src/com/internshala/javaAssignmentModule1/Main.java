package com.internshala.javaAssignmentModule1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Student ID Card Generator
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student's Name : ");
        String name=scanner.nextLine();
        System.out.println("Enter Student's Age : ");
        int age=scanner.nextInt();
        System.out.println("Enter Student's BloodGroup : ");
        String bloodGroup=scanner.next();
        String bloodGroupName;
        if(age>=20){
            bloodGroupName="RED";
        }else if (age>=15 && age<20){
            bloodGroupName="BLUE";
        }else if (age>=10 && age<15){
            bloodGroupName="YELLOW";
        }else{
            bloodGroupName="No match found";
        }

        System.out.println("---------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Blood Group: "+bloodGroup);
        System.out.println("---------------------");
        System.out.println("Your group is "+bloodGroupName);
    }
}
