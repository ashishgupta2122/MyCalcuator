package com.ashish.mycalculator.temp;
import java.util.*;
public class String_Reverse {
    public static boolean isPalindrome(int i,int j,String name)
    {
        if (i >= j)
        {
            return true;
        }
        if (name.charAt(i) != name.charAt(j))
        {
            return false;
        }
        return isPalindrome(i+1,j - 1,name);
    }
    public static boolean isPalindrome(String name)
    {
        return isPalindrome(0,name.length() - 1,name);
    }
    public static void main(String[] args)
    {
        String name = "Ashish";
        name = name.toLowerCase();
        boolean str = isPalindrome(name);
        System.out.println(str);
    }
}
