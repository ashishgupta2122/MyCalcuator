package Array;
import java.util.*;
public class LinearSearch {
    public static int Search(int arr[],int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int k = 10;
        System.out.println("The Key of Value Index "+Search(arr,k));
    }
}
