package com.internshala.JavaPolymorphism;

public class Main {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.run();
    }
}
class Animal{
    public void run(){
        System.out.println("Animal is Running");
    }
}
class Dog extends Animal{
    public void run(){
        super.run();
        System.out.println("Dog is Running");
    }
}
