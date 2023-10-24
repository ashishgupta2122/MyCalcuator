package Sorting;
import java.util.*;
public class MaxChuckSortedII {
    public static int Max(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(arr[i],left[i-1]);
        }

        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.min(arr[i],right[i+1]);
        }
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (left[i] <= right[i+1]) {
                count++;
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,4,6,5,8,7};
        System.out.println(Max(arr));
    }
}
