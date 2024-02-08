package com.internshala.javabasics;
/* The following program when executed throws an exception.
 Surround the following code within the try block
 and catch the exception being thrown within the catch block.
 Also try to find out the name of the exception occurred.
 You may use Intellij IDEA for this code practice.
Your code
============
		public class Main {

    public static void main(String[] args) {

		String str = null;
		String s = str.concat("Hello");
		System.out.println(s);
    }
}
*/
public class CodeChallenge6 {
    public static void main(String[] args){
        System.out.println("Program Starts");
        try{
            String str=null;
            String s=str.concat("Hello");
        }catch(Exception ex){
            System.out.println(ex);
        }finally {
            System.out.println("This block is always executed");
        }
        System.out.println("Program Ends");
    }
}
