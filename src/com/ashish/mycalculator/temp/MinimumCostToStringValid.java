package com.ashish.mycalculator.temp;
import java.util.*;
public class MinimumCostToStringValid {
    public static void main(String[] args)
    {
        Stack<Character> s1 = new Stack<>();
        String str = "{}}{{}";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(')
            {
                s1.push(str.charAt(i));
            }
            else if (!s1.empty() && ((str.charAt(i) == ']' && s1.peek() == '[') ||
                    str.charAt(i) == '}' && s1.peek() == '{') || str.charAt(i) == ')' && s1.peek() == '(')
            {
                s1.pop();
            }
        }
        if (!s1.empty())
        {
            System.out.println("String are Not Valid");
        }
        else
        {
            System.out.println("String are valid");
        }
    }
}
