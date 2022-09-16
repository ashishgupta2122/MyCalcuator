package com.ashish.mycalculator.temp;
import java.util.*;
public class LLDetectCycle {
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
    public static Node Detect(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                return slow;
            }
        }
        return null;
    }
    public static Node detectCycle(Node head)
    {
        Node meet = Detect(head);
        Node start = head;

        while (start != meet)
        {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }
    public static void main(String[] args) {


    }
}
