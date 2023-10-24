package BinarySerachTree1;
import java.util.*;
public class DeleteANode {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static Node Insert(Node root,int val) {
        //base case
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data < val) {
            //left side
            root.left = Insert(root.left,val);
        } else if(root.data > val) {
            //right side
            root.right = Insert(root.right,val);
        }
        return root;
    }
    public static Node findInOrderSuccessor(Node root) {
        if (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static Node Delete(Node root,int val) {
        //base case
        if (root.data < val) {
            root.right = Delete(root.right,val);
        } else if(root.data > val) {
            root.left = Delete(root.left,val);
        } else {
            //1st case
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            } else  if (root.right == null) {
                return root.left;
            }

            Node Is = findInOrderSuccessor(root);
            root.data = Is.data;
            root.right = Delete(root,val);
        }
        return root;
    }
    public static void Inorder(Node root) {
        //base case
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Insert(root,values[i]);
        }

        Inorder(root);
        System.out.println();

        root = Delete(root,1);
        System.out.println(root);
    }
}
