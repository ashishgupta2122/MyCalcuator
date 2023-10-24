package Array;
import java.util.*;
public class KadaneAlgo {
    public static int Maxsum(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum >= maxsum) {
                maxsum = currsum;
            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println("The Maximum sum of Sub Array "+Maxsum(arr));
    }
}
