package Array;
import java.util.*;
public class BinarySearch {
    public static int Search(int arr[],int k) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == k) {
                return mid;
            }

            if (k > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
//            mid = start + (end - start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,45};
        int k = 10;
        System.out.println("The Key value of Index "+Search(arr,k));
    }
}
