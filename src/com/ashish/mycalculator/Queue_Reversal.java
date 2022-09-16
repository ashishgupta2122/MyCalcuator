package com.ashish.mycalculator;
import java.util.*;
public class Queue_Reversal {
    public static  Queue<Integer> queue;
    public static void print()
    {
        while (!queue.isEmpty())
        {
            System.out.println(queue.peek() +" ");
            queue.remove();
        }
    }
    public static void reversequeue()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
        {
            stack.add(queue.peek());
            queue.remove();
        }
        while(!stack.isEmpty())
        {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args)
    {
        queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        reversequeue();
        print();
    }
}
