package com.internshala.javabasics;
//write a program to assign GRADE to the student based on what he scored in exam

public class ConditionalStatements1 {
    public static void main(String args[]){
        int mark=75;
        char grade;

        //IF ELSE IF LADDER
        if(mark>=90){
            grade='A';
        }else if(mark>=80){
            grade='B';
        }else if(mark>=70){
            grade='C';
        }else if(mark>=60){
            grade='D';
        }else{
            grade='F';
        }
        System.out.println("Grade is : "+grade);
    }

}
