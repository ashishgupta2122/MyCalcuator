package Array;
import java.util.*;
public class RainWaterProblrm {
    public static int MostWater(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i],left[i-1]);
        }

        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.max(arr[i],right[i+1]);
        }
        int trapedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left[i],right[i]);
            trapedwater += waterlevel - arr[i];
        }
        return trapedwater;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1};
        System.out.println("Containg Most Water "+MostWater(arr));
    }
}
