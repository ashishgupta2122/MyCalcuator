package Array;
import java.util.*;
public class LargestNumberOfArray {
    public static int Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
//        1st Approach
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//        return largest;
// 2nd Approach
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,43};
        System.out.println("Largest Number of Array "+Largest(arr));
    }
}
