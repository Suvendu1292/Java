package com.internshala.javaconstructors;

public class Rectangle {
    //Instance variables
    public float length;
    public float breadth;
    public float area;

    //Default constructor
    public Rectangle(){
        System.out.println("Default constructor is executed");
    }
    //Parameterized constructor
    public Rectangle(float l,float b){
        length=l;
        breadth=b;
        System.out.println("Parameterized constructor is executed");
        area=l*b;
        System.out.println("Area = "+area);
    }
}
