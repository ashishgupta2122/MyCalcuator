package Array;
import java.util.*;
public class MinimumSumSubArray {
    public static int minimumSumSubArray(int arr[],int target) {
        int l = 0,r = 0;
        int n = arr.length;
//        int x = -1, y = -1;
        int minimumlength = Integer.MAX_VALUE;
        int currsum = 0;
        while (r < n) {
            currsum += arr[r];
            while (currsum >= target) {
                minimumlength = Math.min(minimumlength,r-l+1);
//                if (r-l+1 < minimumlength) {
//                    minimumlength = r-l+1;
//                    x = l;
//                    y = r;
//                }
                currsum -= arr[l];
                l++;
            }
            r++;
        }
        if (minimumlength == Integer.MAX_VALUE) {
            return 0;
        }
//        System.out.println(x +" "+y);
        return minimumlength;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimumSumSubArray(arr,target));
    }
}
