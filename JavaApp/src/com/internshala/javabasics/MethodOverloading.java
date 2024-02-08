package com.internshala.javabasics;

public class MethodOverloading {
    public static void main(String[] args){
        add();
        add(20,30);
        add(2.5f,3.5f,4.5f);
        int add1=add(20,10,45);
        System.out.println(add1);

    }
    public static void add(){
        int addNum=5+7;
        System.out.println(addNum);
    }
    public static void add(int num1,int num2){
        int addNum=num1+num2;
        System.out.println(addNum);
    }
    public static void add(float num1,float num2,float num3){
        float addNum=num1+num2+num3;
        System.out.println(addNum);
    }
    public static int add(int num1,int num2,int num3){
        int addNum=num1+num2+num3;
        return addNum;
    }
}
