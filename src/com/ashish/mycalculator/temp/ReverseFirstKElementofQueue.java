package com.ashish.mycalculator.temp;
import java.util.*;
import java.util.LinkedList;

public class ReverseFirstKElementofQueue {
    public static void Reverse(Queue<Integer> q,int k) {
        Deque<Integer> FirstHalf = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            FirstHalf.push(q.remove());
        }
        while (!FirstHalf.isEmpty()) {
            q.add(FirstHalf.remove());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        Reverse(q,5);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
