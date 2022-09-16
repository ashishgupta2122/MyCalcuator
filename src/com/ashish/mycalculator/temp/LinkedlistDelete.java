package com.ashish.mycalculator.temp;
import java.util.*;
public class LinkedlistDelete {
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
    public static void Delete(int pos)
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
    public static void PrintList()
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.println(" "+curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedList l1 = new LinkedList();
        l1.push(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
        l1.add(16);
        l1.add(17);
        System.out.print("Created Linkedlist ");
        PrintList();
        Delete(4);
        System.out.println("Linked List after Deletion at position 4: ");
        PrintList();

    }
}
