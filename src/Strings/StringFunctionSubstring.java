package Strings;
import java.util.*;
public class StringFunctionSubstring {
    public static String SubString(String str,int start,int end) {
        String substr = "";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
//        System.out.println(SubString(str,0,5));
        System.out.println(str.substring(0,5));
    }
}
