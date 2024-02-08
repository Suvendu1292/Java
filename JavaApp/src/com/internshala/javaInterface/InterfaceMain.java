package com.internshala.javaInterface;

public class InterfaceMain {
    public static void main(String[] args){
        //new Animal();
        Animal animal;

        Animal animal1=new Dog();

        animal1.run();
        animal1.eat();
    }
}

 interface Animal{
    abstract public void run();

    abstract public void eat();
}

class Dog implements Animal{

    @Override
    public void run() {
        System.out.println("Dog is Running !");
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating !");
    }
}