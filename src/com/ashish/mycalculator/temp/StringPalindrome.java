package com.ashish.mycalculator.temp;
import java.util.*;
public class StringPalindrome {
    public static boolean Palindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;

        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "racecar";
        str = str.toUpperCase();
        if (Palindrome(str))
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not Palindrome");
        }
    }
}