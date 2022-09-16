package com.ashish.mycalculator;
import java.util.*;
public class Palindrome_LL {
    public static Node head;
    public static class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
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
    public static boolean Palindrome(Node head)
    {
        if (head == null)
        {
            return true;
        }
        Node Mid = Middle(head);
        Node last = Reverse(Mid.next);
        Node Curr = head;
        while (last != null)
        {
            if (last.data != Curr.data)
            {
                return false;
            }
            last = last.next;
            Curr = Curr.next;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Palindrome_LL list = new Palindrome_LL();
        list.head = new Node(11);
        list.head.next = new Node(12);
        list.head.next.next = new Node(13);
        list.head.next.next.next = new Node(14);
    }
}