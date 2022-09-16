package com.ashish.mycalculator.temp;
import java.util.*;
public class DoublyLinkedList {
    public static class Node
    {
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    public static Node prev = null,head = null;
    public static void ConvertDoublyLL(Node root)
    {
        if (root == null)
        {
            return;
        }
        ConvertDoublyLL(root.left);
        if (prev == null)
        {
            head = root;
        }
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        ConvertDoublyLL(root.right);
    }
    public static void PrintLL(Node root)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.right;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);
        ConvertDoublyLL(root);
        PrintLL(root);
    }
}