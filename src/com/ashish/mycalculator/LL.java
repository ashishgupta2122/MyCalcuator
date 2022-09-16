package com.ashish.mycalculator;
import java.util.ArrayList;
public class LL {
    Node head;
    private int size;

    LL()
    {
        this.size = 0;
    }
    public class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add,first last
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        //Agar Jab head == null nahi hoga tab
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
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
    //deltefirst
    public void deletefirst()
    {
        if (head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }
    //deletelast
    public void deletelast()
    {
        if (head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        size--;
        //Single Node ke liye
        if (head.next == null)
        {
            head = null;
            return;
        }
        Node seconlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null)
        {
            lastNode = lastNode.next;
            seconlast = seconlast.next;
        }
        seconlast.next = null;
    }

    public int getSize()
    {
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deletefirst();
        list.printList();

        list.deletelast();
        list.printList();

        System.out.println(list.getSize());
    }
}