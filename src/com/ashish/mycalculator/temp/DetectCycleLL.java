package com.ashish.mycalculator.temp;
import java.util.*;
public class DetectCycleLL{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data, Node head)
        {
            this.data = data;
            next = null;
        }
    }
    public static boolean DetectCycle(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
       int arr[] = {1,2,3,4,5,6};
       Node head = null;
       for (int i = arr.length - 1; i >= 0; i--)
       {
           head = new Node(arr[i],head);
       }
        head.next.next.next.next.next = head.next.next;

        if (DetectCycle(head)) {
            System.out.println("Cycle Found");
        }
        else {
            System.out.println("No Cycle Found");
        }
    }
}
