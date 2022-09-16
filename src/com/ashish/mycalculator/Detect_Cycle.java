package com.ashish.mycalculator;
import java.util.*;
public class Detect_Cycle {
   Node head;
    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static  Node detectCycle(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next == null)
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
    Node detectfirstNode(Node head)
    {
        Node meet = detectCycle(head);
        Node start = head;
        while (start != meet)
        {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }
    //print
    public void printList()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
    }
}
