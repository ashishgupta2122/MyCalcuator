package com.ashish.mycalculator.temp;
import java.util.*;
public class TraverseLinkedList {
    public static class Node
    {
        int data;
        Node next = null;
    }
    public static void traversel(Node head)
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
        Node node1 = new Node();
        node1.data = 10;

        Node node2 = new Node();
        node2.data = 20;
        node1.next = node2;

        Node node3 = new Node();
        node3.data = 30;
        node2.next = node3;

        Node node4 = new Node();
        node4.data = 40;
        node3.next = node4;

        Node node5 = new Node();
        node5.data = 50;
        node4.next = node5;

        Node head = node1;
        traversel(head);

    }
}
