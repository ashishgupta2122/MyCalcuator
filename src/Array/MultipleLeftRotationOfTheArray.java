package Array;
import java.util.*;
public class MultipleLeftRotationOfTheArray {
    public static void Rotate(int arr[],int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
    }
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        Rotate(arr,k);
        PrintArray(arr);
    }
}
