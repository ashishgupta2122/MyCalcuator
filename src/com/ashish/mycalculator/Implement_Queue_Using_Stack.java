package com.ashish.mycalculator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
public class Implement_Queue_Using_Stack {
    static class myqueue
    {
        Stack s1;
        Stack s2;
        void push(int data)
        {
            s1.push(data);
        }
        int pop() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int ans = (int) s2.pop();
            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            return ans;
        }
    }
    public static void main(String[] args)
    {
        myqueue s1 = new myqueue();
        s1.push(12);
        s1.push(23);
        s1.push(34);
        s1.push(48);
        System.out.println("Popping element from the first stack: "+s1.pop());
    }
}