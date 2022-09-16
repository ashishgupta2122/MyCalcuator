package com.ashish.mycalculator.temp;
import java.util.*;
public class InsertElementStack {
    public static void Insert(Stack<Integer> s1,int n)
    {
        Stack<Integer> temp = new Stack<>();
        while (!s1.empty())
        {
            temp.push(s1.peek());
            s1.pop();
        }
        s1.push(n);
        while (!temp.isEmpty())
        {
            s1.push(temp.peek());
            temp.pop();
        }
        while (!s1.isEmpty())
        {
            System.out.println(s1.peek()+" ");
            s1.pop();
        }
    }
    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<>();
        s1.add(5);
        s1.add(4);
        s1.add(3);
        s1.add(2);
        s1.add(1);
        int n = 7;
        Insert(s1,n);
    }
}
