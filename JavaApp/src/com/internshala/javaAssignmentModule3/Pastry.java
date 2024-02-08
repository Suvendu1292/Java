package com.internshala.javaAssignmentModule3;

public class Pastry extends Cake{

    @Override
    public void display(){
        System.out.println(name+" : " + '\u20B9' + " " + price + " per piece");
    }
}//end of class Pastry
