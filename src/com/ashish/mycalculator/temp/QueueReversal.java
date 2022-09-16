package com.ashish.mycalculator.temp;
import java.util.*;
public class QueueReversal {
    public static void Reversal(Queue<Integer> s1)
    {
        Stack<Integer> s2 = new Stack<>();
        while (!s1.isEmpty())
        {
            s2.push(s1.remove());
        }
        while (!s2.isEmpty())
        {
            s1.add(s2.pop());
            System.out.println(s2);
        }
    }
    public static void main(String[] args)
    {
        Queue<Integer> s1 = new ArrayDeque<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        Reversal(s1);
    }
}
