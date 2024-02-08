package com.internshala.javaconstructors;

public class RectangleMain {
    public static void main(String args[]){

        Rectangle rect1=new Rectangle();
        rect1.length=2.5f;
        rect1.breadth=4.9f;

        Rectangle rect2=new Rectangle(3.8f,8.9f);
        System.out.println(rect2.length);
        System.out.println(rect2.breadth);
    }
}
