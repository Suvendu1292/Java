package com.internshala.javaInheritance;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.color = "black";
        d1.name = "Labrador";
        d1.bark();
        d1.run();

        Cat c1 = new Cat();
        c1.pattern = "tabby";
        c1.name = "Persian cat";
        c1.meow();
        c1.run();

        Animal anml=new Animal();
        anml.name=" My name is Animal";
        anml.run();


    }
}

    class Animal{
        String name;
        public void run(){
            System.out.println("Animal is running");
        }
    }// end of Animal class

    class Dog extends Animal{
        String color;
        public void bark(){
            System.out.println("Whoo! Whoo!");
        }
    }//end of Dog class

    class Cat extends Animal{
        String pattern;
        public void meow(){
            System.out.println("Meow! Meow!");
        }
    }//end of Cat class

