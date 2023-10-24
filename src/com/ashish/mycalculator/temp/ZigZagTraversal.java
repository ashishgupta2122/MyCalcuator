package com.ashish.mycalculator.temp;
import java.util.*;
public class ZigZagTraversal {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static Node head;
    public static Node tail;
    public static void ZigZag() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //Reverse 2nd half;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        Node Left = head;
        Node right = prev;
        Node nextL,nextR;

        //alt merge Zig-Zag merge
        while (Left != null && right != null) {
            nextL = Left.next;
            Left.next = right;
            nextR = right.next;
            right.next = nextL;


            Left = nextL;
            right = nextR;
        }

    }
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//
//        ll.print();
    }
}
