package com.internshala.javaStaticKeyword;
//Static variables use
public class Main {
    public static void main(String[] args){

        Employee employee=new Employee();
        employee.name="Chiku";
        //employee.companyName; not allowed
        employee.name="Suvendu";

        System.out.println(Employee.companyName);

        Employee.count=20;
        System.out.println(Employee.count);
    }
}
class Employee{
    public String name;

    public static final String companyName="Internshala";//Constant value. class variable

    public static int count=0; //   CLASS VARIABLES
}
