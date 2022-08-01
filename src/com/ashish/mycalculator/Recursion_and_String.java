package com.ashish.mycalculator;
import java.util.Scanner;
public class Recursion_and_String {
    public static String remove(String str)
    {
        if (str.length() == 0)
        {
            return str;
        }
        String ans = "";
        if(str.charAt(0) != 'x')
        {
            ans = ans + str.charAt(0);
        }
        String smallAns = remove(str.substring(1));
        return ans + smallAns;
    }
    public static void main(String[] args)
    {
        String str = "xabcxdex";
        System.out.println(remove(str));
    }
}
