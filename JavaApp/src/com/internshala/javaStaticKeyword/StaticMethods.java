package com.internshala.javaStaticKeyword;

public class StaticMethods {
    public static void main(String[] args){

        Employee1 employee=new Employee1();
        employee.name="Chiku";
        //employee.companyName; not allowed
        employee.name="Suvendu";

        System.out.println(Employee1.companyName);

        Employee1.count=20;
        System.out.println(Employee1.count);

        Employee1.myFirstStaticMethod();

    }
}
class Employee1{
    public String name;

    public static final String companyName="Internshala";//Constant value. class variable

    public static int count=0; //   CLASS VARIABLES

    public static void myFirstStaticMethod(){
        System.out.println("My First Static Method");

        System.out.println(Employee1.count);
            //test();
    }

    public void test(){
        System.out.println("Non static method");
    }
}

