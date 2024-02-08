package com.internshala.javaAssignmentModule3;

public class Cake {
    //instance variables
    String name;
    float price;

    //getter and setter methods
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(name+" : " + '\u20B9' + " " + price + " per pound");
    }//end of display() method

}//end of Cake class
