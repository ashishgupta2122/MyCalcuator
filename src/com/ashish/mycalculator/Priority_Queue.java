package com.ashish.mycalculator;
import java.util.*;
public class Priority_Queue {
    public static void  main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(14);
        pq.add(11);
        pq.add(12);
        pq.add(34);
        System.out.println(pq.size());
        while (!pq.isEmpty());
        System.out.println(pq.peek());
        pq.poll();
    }
}
