package com.ashish.mycalculator.temp;
import java.util.*;
public class LongestCommonPrefix {
    public static String Longest(String s1[]) {
        if (s1.length == 0) {
            return "";
        }
        String prefix = s1[0];
        for (int i = 1; i < s1.length; i++)
            while (s1[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
    public static void main(String[] args)
    {
        String s1[] = {"flower","flow","flight"};
        System.out.println(Longest(s1));
    }
}
