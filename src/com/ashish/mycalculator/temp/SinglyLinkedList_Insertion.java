package com.ashish.mycalculator.temp;
import java.util.*;
public class SinglyLinkedList_Insertion {
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
    public static void Insert(Node head,int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public static void Print(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args)
    {
        Node node1 = new Node(10);
        System.out.println(node1.data);
        System.out.println(node1.next);

        Node head = node1;
        Print(head);

        Insert(head,9);
        Print(head);

    }
}
