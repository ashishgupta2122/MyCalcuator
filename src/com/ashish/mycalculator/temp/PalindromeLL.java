package com.ashish.mycalculator.temp;
import java.util.*;
public class PalindromeLL {
    public static class Node
    {
        int data;
        Node next = null;
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
    public static Node Middle(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean Palindrome(Node head)
    {
        if (head == null)
        {
            return true;
        }
        Node mid = Middle(head);
        Node last = Reverse(mid.next);
        Node curr = head;

        while (last != null)
        {
            if (last.data != curr.data)
            {
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }
    public static void print(Node head)
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
        Node h1 = new Node();
        h1.data = 1;

        Node h2 = new Node();
        h2.data = 1;
        h1.next = h2;

        Node h3 = new Node();
        h3.data = 1;
        h2.next = h3;

        Node h4 = new Node();
        h4.data = 1;
        h3.next = h4;

        boolean condition = Palindrome(h1);
        System.out.println("Palidrome :" + condition);


    }
}