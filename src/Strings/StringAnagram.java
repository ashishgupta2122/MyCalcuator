package Strings;
import java.util.*;
public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] strChar1 = str1.toCharArray();
            char[] strChar2 = str2.toCharArray();

            Arrays.sort(strChar1);
            Arrays.sort(strChar2);

            boolean result = Arrays.equals(strChar1,strChar2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram of each other.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram of each other.");
        }
    }
}
