package Array;
import java.util.*;
public class TripletsSum3 {
    public static void Sum(int arr[],int target) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n-2; i++) {
            int start = i+1;
            int end = n-1;

            while (start < end) {
                if (start > 0 && arr[start] == arr[start-1]) {
                    start++;
                    continue;
                }

                if (end < n-1 && arr[end] == arr[end+1]) {
                    end--;
                    continue;
                }

                if (arr[i] + arr[start] + arr[end] == target) {
                    System.out.println("("+arr[i]+","+arr[start]+","+arr[end]+")");
                } else if (arr[i] + arr[start] + arr[end] < target) {
                    start++;
                }else {
                    end--;
                }
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,2,2,1,1,1,-1,-3,0,1,2,3,3,3};
        int target = 9;
        Sum(arr,target);
    }
}
