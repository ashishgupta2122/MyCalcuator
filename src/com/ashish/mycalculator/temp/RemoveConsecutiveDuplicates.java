package com.ashish.mycalculator.temp;
import java.util.*;
public class RemoveConsecutiveDuplicates {
    public static String Remove(String str)
    {
        if (str.length() <= 1)
        {
            return str;
        }
        if (str.charAt(0) == str.charAt(1))
        {
            return Remove(str.substring(1));
        }
        else
        {
            return str.charAt(0) + Remove(str.substring(1));
        }
    }
    public static void main(String[] args)
    {
        String str = "greekforgreeks";
        System.out.println(Remove(str));
    }
}