package com.internshala.javabasics;

//WAP to find out sum of all the array elements
public class Array1DPro {
    public static void main(String[] args){
        //array index starts from 0
        //0 ,1 , 2, 3, 4
        int[] newIntArray={12,20,30,35,50};
        int sum=0;
        for(int i=0 ; i< newIntArray.length ; i++){
            sum=sum+newIntArray[i];
            System.out.println(newIntArray[i]);
        }
            System.out.println("Sum of element is : "+sum);


    }
}