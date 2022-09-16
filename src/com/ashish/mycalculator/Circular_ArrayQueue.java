package com.ashish.mycalculator;
import java.util.*;
public class Circular_ArrayQueue {
    private static class circular_Array
    {
        private final int n;
        int a[];
        int N;
        int front = -1;
        int rear = -1;

        public circular_Array(int n)
        {
            this.n = n;
            a = new int[n];
        }

        void enqueue(int data)
        {
            if ((rear + 1)%n == front)
            {
                return;
            }
            if (front == -1)
                front = 0;
            rear = (rear + 1)%n;
            a[rear] = data;
        }
        int deqeue()
        {
            if (front == -1)
            {
                System.out.println("Underflow");
            }
            int result = a[front];
            if (front == rear)
                front = rear = -1;
            else {
                front = (front + 1)%n;
            }
            return result;
        }
    }
    public static void main(String[] args) {

    }
}
