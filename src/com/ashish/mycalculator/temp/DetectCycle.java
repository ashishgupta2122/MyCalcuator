package com.ashish.mycalculator.temp;
import java.util.*;
public class DetectCycle {
    public static Node head;
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node DetectCycle(Node head){
        Node Slow  = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            Slow = Slow.next;

            if (Slow == fast)
            {
                return Slow;
            }
        }
        return null;
    }
    public static Node Detect(Node head){
        Node Meet = DetectCycle(head);
        Node Start = head;

        while (Start != Meet)
        {
            Start = Start.next;
            Meet = Meet.next;
        }
        return Start;
    }
    public static void Print(Node head)
    {
        Node Curr = head;
        while (Curr != null)
        {
            System.out.print(Curr.data+" ");
            Curr = Curr.next;
        }
    }
    public static void main(String[] args)
    {
        DetectCycle list = new DetectCycle();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        head.next.next.next.next.next = head.next.next;
        list.Detect(head);
        System.out.println("Linked List after removing loop : ");
        list.Print(head);
    }
}