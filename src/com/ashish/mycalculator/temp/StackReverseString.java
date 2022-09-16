package com.ashish.mycalculator.temp;
import java.util.*;
public class StackReverseString {
    public static String ReverseString(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        char[] reverseString = new char[str.length()];
        int i = 0;
        while (!stack.isEmpty()) {
            reverseString[i++] = stack.pop();
        }
        return new String(reverseString);
    }

    public static void main(String[] args) {
        String str = "ashish";
        System.out.println("Reverse String "+ReverseString(str));
    }
}