package com.internshala.javaColletionFramework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> listsName=new ArrayList();

        listsName.add("Sam"); // Index 0
        listsName.add("Rahul");//1
        listsName.add("Tony");//2
        listsName.add("Suva");//3
        listsName.add("Tony");//4

        listsName.remove(1); //removes the element Rahul
        //listsName.add("Rahul"); // add Peter to the last line of the index
        listsName.add(1,"Peter");
        listsName.set(1,"Rahul"); //Replace element at index 1 by Rahul
        listsName.remove("Suva");
        // System.out.println(listsName.get(1));

        //for each loop
        for(String name: listsName){
            System.out.println(name);
        }


        //Create a ArrayList of Employee and print out the names.
        Employee employee1=new Employee("Charle");
        Employee employee2=new Employee("Ben");
        Employee employee3=new Employee("kevin");

        List<Employee> namesList=new ArrayList<>();
        namesList.add(employee1);
        namesList.add(employee2);
        namesList.add(employee3);

        for(Employee employee:namesList){
            System.out.println(employee.name);
        }

    }
}
class Employee{
    public String name;

    public Employee(String name){
        this.name=name;
    }
}
