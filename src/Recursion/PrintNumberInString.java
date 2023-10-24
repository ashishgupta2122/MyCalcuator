package Recursion;
import java.util.*;
public class PrintNumberInString {
    public static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int number) {
        //base case
        if (number == 0) {
            return;
        }

        int lastDigits = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigits]+" ");
    }
    public static void main(String[] args) {
        printDigits(1947);
    }
}
