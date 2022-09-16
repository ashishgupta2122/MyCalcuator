package com.ashish.mycalculator;
import java.util.*;
public class Queue_Implementation {
    public static void main(String[] args) {
        Queue<Integer> s1 = new ArrayDeque<>();
        s1.add(12);
        s1.add(23);
        s1.add(34);
        s1.add(45);
        while (!s1.isEmpty())
        {
            s1.poll();
        }
    }
}
