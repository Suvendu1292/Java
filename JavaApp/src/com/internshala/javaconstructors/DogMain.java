package com.internshala.javaconstructors;

public class DogMain {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        Dog d2 = new Dog("German Shephherd",50,"black");

        System.out.println(d2.bread);
        System.out.println(d2.size);
        System.out.println(d2.color);
     }
    }
