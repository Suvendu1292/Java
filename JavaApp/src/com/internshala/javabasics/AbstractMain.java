package com.internshala.javabasics;

public class AbstractMain {
    public static void main(String[] args){
        //new Animal(); Not allowed.can not create objects of abstract class
        Animal animal; //Allowed. we can create reference of abstract class

        Animal animal1=new Dog(); // Parent class reference --> Child class object

        animal1.run();
        animal1.eat();
    }
}
abstract class Animal{
    public void run(){
        System.out.println("Animal is Running !");
    }

    abstract public void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is Eating !");
    }
}