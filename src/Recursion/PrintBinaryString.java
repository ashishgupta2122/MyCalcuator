package Recursion;
import java.util.*;
public class PrintBinaryString {
    public static void Print(int n,int lastplace, String str) {
        //base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        Print(n-1,0,str+"0");
        if (lastplace == 0) {
            Print(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        Print(3,0,"");
    }
}
