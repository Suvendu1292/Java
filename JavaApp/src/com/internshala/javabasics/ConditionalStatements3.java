package com.internshala.javabasics;

//Write a program to provide REMARKS to the students based on his GRADE.
public class ConditionalStatements3 {
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

        //SWITCH
         switch (grade){
             case 'A':
                 System.out.println("Excellent Score");
                 break;
             case 'B':
                 System.out.println("Very good Score");
                 break;
             case 'C':
                 System.out.println("Good Score , You can do better!");
                 break;
             case 'D':
                 System.out.println("Average Score");
                 break;
             case 'F':
                 System.out.println("You have Failed");
                 break;

         }
    }
}
