package com.ashish.mycalculator;
import java.util.LinkedList;
public class Palindrome_LL {
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean palindrome(Node head)
    {
        if (head == null)
        {
            return true;
        }
      //  Node mid = middle(head);
        //Node last = reverse(mid.next);
        Node curr = head;
        //while(last != null)
        {
          //  if (last.data != curr.data)
            {
                return false;
            }
        //    last = last.next;
            //curr = curr.next;
        }
        //return true;
    }
    public static void main(String[] args)
    {

    }
}
