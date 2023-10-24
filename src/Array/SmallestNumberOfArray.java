package Array;
import java.util.*;
public class SmallestNumberOfArray {
    public static int Smallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            smallest = Math.min(smallest,arr[i]);
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,75,44,54};
        System.out.println("Smallest Number of Array "+Smallest(arr));
    }
}
