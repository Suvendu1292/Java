package com.internshala.javaconstructors;

public class Dog {
    public String  bread;
    public int size;
    public String color;

    public Dog(){
        System.out.println("Default constructor is executed");
    }
    public Dog(String b,int sz,String clr){
        bread=b;
        size=sz;
        color=clr;
        System.out.println("Parameterized constructor is executed");
    }
}
