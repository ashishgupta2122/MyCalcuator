package com.ashish.mycalculator.temp;
import java.util.*;
public class ReverseStack {
    public static void addAtBottom(Stack<Integer> s,int data) {
        //base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        addAtBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        addAtBottom(s,top);
    }
    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverseStack(s);
        print(s);
    }
}
