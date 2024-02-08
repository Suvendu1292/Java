package com.internshala.javabasics;

public class ExceptionHandling {
    public static void main(String[] args){
        System.out.println("Program Starts");//executed

        int myArray[]={10,20,30,40};
        try{
            int result=myArray[1]/0;  //ArithmeticException
            System.out.println(myArray[8]);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("This block is always executed");
        }

        try{
            String s=null;
            System.out.println(s.length());
        }catch(Exception ex){
            System.out.println(ex);
        }

        System.out.println("Program Ends"); //executed

    }
}
