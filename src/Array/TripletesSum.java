package Array;
import java.util.*;
public class TripletesSum {
    public static boolean Sum(int arr[],int target) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n-2; i++) {
            int start = i+1;
            int end = n-1;

            while (start < end) {
//                if (start > 0 && arr[start] == arr[start-1]) {
//                    start++;
//                    continue;
//                }
//
//                if (end < n-1 && arr[end] == arr[end+1]) {
//                    end++;
//                    continue;
//                }
                if (arr[i]+arr[start]+arr[end] == target) {
                    return true;
                } else if(arr[i]+arr[start]+arr[end] > target) {
                    end--;
                }else {
                    start++;
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
