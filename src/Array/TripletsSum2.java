package Array;
import java.util.*;
public class TripletsSum2 {
    public static boolean Sum(int arr[],int target) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i++) {
            int start = i+1;
            int end = n-1;

            while (start < end) {
                if (arr[i] + arr[start] + arr[end] == target) {
                    System.out.println(arr[i]+","+arr[start]+","+arr[end]);
                    return true;
                } else if (arr[i] + arr[start] + arr[end] < target) {
                    start++;
                }else {
                    end--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 9;
        System.out.println(Sum(arr,target));
    }
}
