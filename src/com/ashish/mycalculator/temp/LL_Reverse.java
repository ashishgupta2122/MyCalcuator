package com.ashish.mycalculator.temp;
import java.util.*;
public class LL_Reverse {
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
    public void printlist(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        LL_Reverse list = new LL_Reverse();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Reversed Linklist");
        head = Reverse(head);
        list.printlist(head);
    }
}
