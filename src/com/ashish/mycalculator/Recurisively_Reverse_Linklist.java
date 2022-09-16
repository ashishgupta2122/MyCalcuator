package com.ashish.mycalculator;
import java.util.LinkedList;
public class Recurisively_Reverse_Linklist {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newhead = reverse(head.next);
        Node headNext = head.next;
        headNext = head;
        head = null;
        return newhead;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(7);
        list.add(4);

        head = reverse(head);
        System.out.println(reverse(head));
    }
}
