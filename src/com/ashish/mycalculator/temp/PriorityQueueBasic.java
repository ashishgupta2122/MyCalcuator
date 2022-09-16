package com.ashish.mycalculator.temp;
import java.util.*;
public class PriorityQueueBasic {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> s1 = new PriorityQueue<>();
        s1.add(5);
        s1.add(10);
        s1.add(15);
        s1.add(20);
        System.out.println(s1.size());
        while (!s1.isEmpty())
        {
            System.out.println(s1.peek());
            s1.poll();
        }
    }
}
