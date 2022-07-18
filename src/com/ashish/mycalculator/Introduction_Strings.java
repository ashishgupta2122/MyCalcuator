package com.ashish.mycalculator;
import java.util.Scanner;
public class Introduction_Strings {
    public static void main(String[] args)
    {
        String str1 = "Ashish";
        String str2 = "Gupta";
        String str = str1 + str2;
        String substr = str1.substring(1,5);
        System.out.println(substr);
        System.out.println(substr.length());
        System.out.println(str);
        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.substring(1));

    }
}
//Output
//shis
//4
//AshishGupta
//6
//h
//ashish
//ASHISH
//shish