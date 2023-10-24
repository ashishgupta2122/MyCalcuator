package BinarySerachTree1;
import java.util.*;
public class SearchABst {
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

        if (root.data > val) {
            root.left = Insert(root.left,val);
        } else {
            root.right = Insert(root.right,val);
        }
        return root;
    }
    public static boolean Search(Node root,int key) {
        //base case
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            //Go to left side
            return Search(root.left,key);
        } else {
            return Search(root.right,key);
        }
    }
//    public static void Traversal(Node root) {
//        if (root == null) {
//            return;
//        }
//
//        Traversal(root.left);
//        System.out.print(root.data+"");
//        Traversal(root.right);
//    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i = 0; i< values.length; i++) {
            root = Insert(root,values[i]);
        }

//        Traversal(root);
        if (Search(root,7)) {
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}
