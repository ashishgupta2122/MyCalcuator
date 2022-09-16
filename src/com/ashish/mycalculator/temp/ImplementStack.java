package com.ashish.mycalculator.temp;
import java.util.*;
public class ImplementStack {
    //Properties
    int arr[];
    int top;
    int capacity;

    public ImplementStack(int capacity)
    {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }
    public void push(int data)
    {
        if (capacity - top > 1)
        {
            top++;
            arr[top] = data;
        }
        else {
            System.out.println("Stack is Overflow");
        }
    }
    public int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is Underflow");
        }
        int res = arr[top];
        top--;
        return res;
    }
    public int Peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is Empty");
        }
         return arr[top];
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<>();
        s1.add(12);
        s1.add(13);
        s1.add(14);
        s1.add(15);

        System.out.println(s1.peek()+" ");
        System.out.println(s1.pop()+" ");
        System.out.println(s1.pop()+" ");
    }
}