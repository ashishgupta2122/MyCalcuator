package com.ashish.mycalculator.temp;
import java.util.*;
public class Duplicate {
    public static boolean DuplicateParenthisis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }else {
                    s.pop();
                }
            }
            else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str =  "((a+b))";
        System.out.println(DuplicateParenthisis(str));
    }
}
