package Array;
import java.util.*;
public class FirstPositiveMissingNumber {
    public static void Swap(int arr[], int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static int Positive(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int Ci = arr[i]-1;
            if (arr[i] > 0 && arr[i] < n && arr[i] != arr[Ci]) {
                int temp = arr[Ci];
                arr[Ci] = arr[i];
                arr[i] = temp;
                Ci = arr[i]-1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i+1) {
                return i+1;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        int arr[] = {0,-10,1,3,-20};
        System.out.println(Positive(arr));
    }
}
