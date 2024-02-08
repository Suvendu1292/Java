package com.internshala.javaGetterAndSetter;

//In IntellijIDEA, within class Dog create the Getters and Setters
// for all the three instance variables of breed, size and color.

public class DogMain {
    public static void main(String[] args){
        Dog d1=new Dog();

        d1.setBread("German Shephherd");
        d1.setSize(50);
        d1.setColor("black");

        System.out.println(d1.getBread());
        System.out.println(d1.getSize());
        System.out.println(d1.getColor());

        d1.bark();
        d1.run();


    }
}
