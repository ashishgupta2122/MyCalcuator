package com.ashish.mycalculator.temp;
import java.util.*;
public class ReverseStringStack {
    public static String Reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char top = s.pop();
            result.append(top);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = Reverse(str);
        System.out.println(result);
    }
}
