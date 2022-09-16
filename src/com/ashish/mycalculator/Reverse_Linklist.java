package com.ashish.mycalculator;

import java.util.LinkedList;

public class Reverse_Linklist {
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public static Node reverse(Node head)
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
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);


        //printList(node);
    }
}