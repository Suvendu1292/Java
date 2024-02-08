package com.internshala.javaInheritance;

public class ExerciseMain {
    public static void main(String args[]){

        Puppy puppy=new Puppy();
        puppy.size=50;
        System.out.println(puppy.size);
        puppy.age=5;
        System.out.println(puppy.age);
        puppy.color="white";
        System.out.println(puppy.color);
        puppy.name="Jerry";
        System.out.println(puppy.name);
        puppy.bark();
        puppy.run();
    }//end of main(-) method
}//end of MainExercise class
 class Animal1 {
    String name;
    public void run(){
        System.out.println("Animal is running");
    }
}//end of Animal class
class Dog1 extends Animal1{
    String color;
    public void bark(){
        System.out.println("Whoo! Whoo!");
    }
}//end of Dog class
class Puppy extends Dog1{
    int size;
    int age;

}//end of Puppy class