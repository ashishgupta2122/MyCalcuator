package com.ashish.mycalculator;
import java.util.LinkedList;
public class LL {
    Node head;
    private int size = 0;
    LL(){
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
    // add - first,last
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)//Corner Case
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if (head == null)//Corner Case
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
        //Corner Case
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //delete First
    public void deleteFirst(){
        if (head == null)//Corner Case
        {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if (head == null)//Corner Case
        {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null)
        {
            head = null;
            return;
        }
        Node SecondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args)
    {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}