package com.internshala.javaOop;

public class DogMain {
    public static void main(String[] args){
        Dog d1=new Dog();

        d1.bread="German Shephherd";
        d1.size=50;
        d1.color="black";

        d1.bark();
        d1.run();

        System.out.println(d1.bread);
        System.out.println(d1.size);
        System.out.println(d1.color);

    }
}
