package Array;
import java.util.*;
public class MaxSubArraySum {
    public static int Maximum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += arr[k];
                }
                System.out.println(currsum+" ");
               maxsum = Math.max(maxsum,currsum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println("Maximum Sum of SubArray "+Maximum(arr));
    }
}
