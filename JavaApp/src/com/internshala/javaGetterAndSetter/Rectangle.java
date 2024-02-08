package com.internshala.javaGetterAndSetter;

public class Rectangle {

    //Instance variables
    private float length;
    private float breadth;

    public float getArea(){
        float area=length*breadth;
        return area;
    }
    public float getPerimeter(){
        float perimeter=2* (length+breadth);
        return perimeter;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

}