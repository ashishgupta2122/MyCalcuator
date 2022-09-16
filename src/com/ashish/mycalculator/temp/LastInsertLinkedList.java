package com.ashish.mycalculator.temp;
import java.util.*;
public class LastInsertLinkedList {
    public static Node head;
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
    public static void Insert(int value,Node head,int pos)
    {
        Node Toadd = new Node(value);
       if (pos == 0)
       {
            Toadd.next = head;
            head = Toadd;
            return;
       }
       Node prev = head;
       for (int i = 0; i < pos - 1; i++)
       {
           prev = prev.next;
       }
       Toadd.next = prev.next;
       prev.next = Toadd;
    }
    public static void Print(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedList<Integer> l1 = new LinkedList<>();
        Node h1 = new Node(5);
        Node head = h1;

        Node h2 = new Node(10);
        head.next = h2;

        Node h3 = new Node(15);
        h2.next = h3;

        Node h4 = new Node(24);
        h3.next = h4;

        Node h5 = new Node(40);
        h4.next = h5;

        Insert(16,head,4);
        Print(head);

        System.out.println("New Linked List Create");
        Insert(45,head,6);
        Print(head);

    }
}
