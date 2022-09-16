package com.ashish.mycalculator;
import java.util.*;
public class ReverseLL {
    public static Node head;
    public static class Node{
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
        Node Curr = head;
        Node prev = null;

        while (Curr != null)
        {
            Node temp = Curr.next;
            Curr.next = prev;
            prev = Curr;
            Curr = temp;
        }
        return prev;
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
        ReverseLL list = new ReverseLL();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(14);

        System.out.println("Reversed Linklist");
        head = Reverse(head);
        list.Print(head);
    }
}