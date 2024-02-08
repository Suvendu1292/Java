package com.internshala.javaConstructorOverloading;
//Constructor overloading : same name but different parameters
//this keyword refers to the current instance of the class
public class RectangleMain {
    public static void main(String args[]){

        Rectangle rect1=new Rectangle();

        Rectangle rect2=new Rectangle(3.8f,8.9f);
        System.out.println(rect2.length);
        System.out.println(rect2.breadth);
    }
}
