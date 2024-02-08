package com.internshala.javabasics;
//WAP to find the sum of all the elements in 2D array
public class Array2DPro {
    public static void main(String[] args){

        int myFirst2DArray[] []={   {2,3,4,6},
                {56,87,23,5},
                {10,20,30,8},
                {12,21,32,45}
        };
        int sum=0;
        for(int row=0;row < myFirst2DArray.length; row++){
            for(int column=0;column < myFirst2DArray[row].length;column++){
                System.out.print(myFirst2DArray[row][column]+ " ");
                sum = sum+myFirst2DArray[row][column];
            }
            System.out.println();

        }
        System.out.println("Sum of elements are :"+sum);

    }
}
