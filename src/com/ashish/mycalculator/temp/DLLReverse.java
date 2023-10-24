package com.ashish.mycalculator.temp;
import java.util.*;
public class DLLReverse {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void Reverse() {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            curr.prev = temp;

            prev = curr;
            curr = temp;
        }
        head = prev;
    }
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+"<->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DLLReverse ll = new DLLReverse();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.Reverse();
        ll.print();
    }
}
