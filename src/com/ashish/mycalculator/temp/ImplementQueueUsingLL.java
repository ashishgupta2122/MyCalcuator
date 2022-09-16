package com.ashish.mycalculator.temp;
import java.util.*;
public class ImplementQueueUsingLL {
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public static class Queue
    {
        Node front;
        Node rear;
        void enqueue(int data)
        {
            Node newNode = new Node(data);
            if (front == null)
            {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            newNode = rear;
        }
        int dequeue()
        {
            if (front == null)
            {
                return -1;
            }
            int result = front.data;
            front = front.next;
            return result;
        }
    }
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.data);
        System.out.println("Queue Rear : " + q.rear.data);
    }
}
