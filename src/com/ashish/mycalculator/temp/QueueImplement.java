package com.ashish.mycalculator.temp;
import java.util.*;
public class QueueImplement {
    public static void main(String[] args)
    {
        Queue<Integer> s1 = new ArrayDeque<>();
        s1.offer(12);
        s1.offer(13);
        s1.offer(14);
        s1.offer(15);
        s1.poll();
        s1.peek();
        s1.size();
        s1.isEmpty();
    }
}
