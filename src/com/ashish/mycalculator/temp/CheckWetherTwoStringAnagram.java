package com.ashish.mycalculator.temp;
import java.util.*;
public class CheckWetherTwoStringAnagram {
    public static boolean Areanagram(char str1[],char str2[])
    {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
        {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
        {
            if (str1 != str2)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        char str1[] = {'t','e','s','t'};
        char str2[] = {'t','t','e','w'};
        if (Areanagram(str1,str2))
        {
            System.out.println("The Two String are Anagram of Each other");
        }
        else {
            System.out.println("The Two String are not Anagram of Each other");
        }
    }
}
