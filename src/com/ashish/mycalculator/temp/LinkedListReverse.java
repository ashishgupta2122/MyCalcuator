package com.ashish.mycalculator.temp;
import java.util.*;
public class LinkedListReverse {
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
    public static Node Reverse(Node head)
    {
        Node curr = head;
        Node prev = null;

        while (curr != null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void PrintList(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedListReverse list = new LinkedListReverse();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.PrintList(head);
        head = list.Reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.PrintList(head);
    }
}
