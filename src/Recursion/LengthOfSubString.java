package Recursion;
import java.util.*;
public class LengthOfSubString {
    public static int Length(String str) {
        //base case
        if (str.length() == 0) {
            return 0;
        }
        return Length(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(Length(str));
    }
}
