package com.ashish.mycalculator;
import java.util.*;
public class Linklist_Traversal {
    public static class Node
    {
        int data;
        Node next = null;
    }
    public static void traversal(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args)
    {
        Node node1 = new Node();
        node1.data = 12;

        Node node2 = new Node();
        node2.data = 13;
        node1.next = node2;

        Node node3 = new Node();
        node3.data = 14;
        node2.next = node3;

        Node node4 = new Node();
        node4.data = 15;
        node3.next = node4;

        Node head = node1;
        traversal(head);
    }
}