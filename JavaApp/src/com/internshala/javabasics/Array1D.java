package com.internshala.javabasics;

public class Array1D {
    public static void main(String[] args){
        //array index starts from 0
                        //0 ,1 , 2, 3, 4
        int[] newIntArray={12,20,30,35,50};
        System.out.println(newIntArray[2]);
        //to know the length of the array
        System.out.println(newIntArray.length);
        //update the element
        newIntArray[3]=40;
        System.out.println(newIntArray[3]);
        System.out.println("===========");

        for(int i=0 ; i< newIntArray.length ; i++){
            System.out.println(newIntArray[i]);
        }//for

        //newIntArray[8]=60; //Not allowed
        System.out.println("===========");
        float[] newFloatArray=new float[3];
        newFloatArray[0]=2.5f;
        newFloatArray[1]=5.6f;
        newFloatArray[2]=7.2f;
        //for each loop
        for (float num: newFloatArray) {
            System.out.println(num);
            
        }
        
        
    }
}
