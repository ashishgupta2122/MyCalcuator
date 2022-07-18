package com.ashish.mycalculator;
import java.util.Scanner;
public class String_Palindrome {
    public static boolean check(String ch)
    {
        int i = 0;
        int j = ch.length() - 1;
        while(i < j)
        {
            if (ch.charAt(i) != ch.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String ch = "JuJ";
        System.out.println(check(ch));
    }
}
