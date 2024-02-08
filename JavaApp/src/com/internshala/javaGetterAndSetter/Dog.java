package com.internshala.javaGetterAndSetter;

public class Dog {
    //instance variables
    private String  bread;
    private int size;
    private String color;
//getters and setters
    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void bark(){
        System.out.println("Whoo! Whoo!");
    }
    public void run(){
        System.out.println("I am running");
    }
}
