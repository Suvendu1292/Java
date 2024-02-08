package com.internshala.javabasics;

import java.util.Locale;

public class StringExp {
    public static void main(String[] args){
        char[] myArray={'w','e','l','c','o','m','e'};

        String myString="welcome";

        System.out.println(myArray);
        System.out.println(myString);

        System.out.println(myArray.length);
        System.out.println(myString.length());

        System.out.println(myString.charAt(4));

        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());

        System.out.println(myString.contains("come"));

        System.out.println(myString.concat(" to Internshala"));

    }
}
