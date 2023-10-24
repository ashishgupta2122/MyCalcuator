package Sorting;
import java.util.*;
public class MaxChunksSorted {
    public static int Max(int arr[]) {
        //base case
        if (arr.length == 0) {
            return 0;
        }
        int maxsofor = arr[0];
        int chunk = 0;
        for (int i = 0; i < arr.length; i++) {
            maxsofor = Math.max(maxsofor,arr[i]);

            if (i == maxsofor) {
                chunk++;
            }
        }
        return chunk;
    }
    public static void main(String[] args) {
        int arr[] = {2,0,1,5,3,4,6};
        System.out.println(Max(arr));
    }
}
