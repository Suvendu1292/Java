package com.internshala.javaConstructorOverloading;

public class Rectangle {
    //Instance variables
    public float length;
    public float breadth;
    public float area;

    //Default constructor
    public Rectangle(){
        this(2.5f);
        System.out.println("Default constructor is executed");

    }
    public Rectangle(float length){
        this.length=length; //instance length variable value assigned to the length variable
    }
    //Parameterized constructor
    public Rectangle(float length, float breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("Parameterized constructor is executed");
        area=length*breadth;
        System.out.println("Area = "+area);
    }
}
