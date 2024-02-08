package com.internshala.javaOop;
//Within the class Rectangle, define:
//Two field variables of length and breadth
//Methods to calculate the area and the perimeter of the Rectangle
public class Rectangle {
        public float length;
        public float breadth;

        public float getArea(float length,float breadth){
            float area=length*breadth;
            return area;
        }
        public float getPerimeter(float length,float breadth){
            float perimeter=2 * (length+breadth);
            return perimeter;
        }
}
