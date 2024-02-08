package com.internshala.javabasics;

public class ConditionalStatements {
    public static void main(String args[]){

        boolean isSecular=true;
        //IF ELSE STATEMENT
        if(isSecular){
            System.out.println("India is a secular state");
        }else{
            System.out.println("India isnot  a secular state");
        }

        //Ternary Operator
        String msg= isSecular ? "India is a secular state" : "India isnot  a secular state" ;
        System.out.println(msg);
    }
}
