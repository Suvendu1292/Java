package com.internshala.javabasics;

//WAP to find the sum of two numbers
// and print the sum by returning the value from the method.
public class CodeChallenge5 {
    public static void main(String[] args){
        int sum1 =calculateSum(20,30);
        System.out.println(sum1);

    }
    public static int calculateSum(int num1,int num2){
        int addNum=num1+num2;
        return addNum;
    }
}
