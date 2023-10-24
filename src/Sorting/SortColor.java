package Sorting;
import java.util.*;
public class SortColor {
    public static void Sort(int arr[]) {
        int left = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid <= high) {
            if (arr[mid] == 2) {
                arr[mid] = arr[high];
                high--;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 0) {
                arr[mid] = arr[left];
                left++;
                mid++;
            }
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,2,2,2};
        Sort(arr);
        printArray(arr);
    }
}
