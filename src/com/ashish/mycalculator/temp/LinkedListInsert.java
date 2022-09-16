package com.ashish.mycalculator.temp;
import java.util.*;
public class LinkedListInsert {
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
    public static void Delete(Node head,int pos)
    {
        if (pos == 0)
        {
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++)
        {
            prev = prev.next;
        }
        prev.next = prev.next.next;
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
        Node h1 = new Node(5);
        Node head = h1;

        Node h2 = new Node(10);
        head.next = h2;

        Node h3 = new Node(15);
        h2.next = h3;

        Node h4 = new Node(12);
        h3.next = h4;

        Node h5 = new Node(14);
        h4.next = h5;

        System.out.println("Delete Element Linked List");
        Delete(head,3);
        Print(head);
    }
}
