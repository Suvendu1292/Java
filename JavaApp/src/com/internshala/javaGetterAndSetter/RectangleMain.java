package com.internshala.javaGetterAndSetter;


public class RectangleMain {
    public static void main(String args[]){

        Rectangle rect1=new Rectangle();
        rect1.setLength(3.8f);
        rect1.setBreadth(4.9f);

        System.out.println(rect1.getLength());
        System.out.println(rect1.getBreadth());
    }
}
