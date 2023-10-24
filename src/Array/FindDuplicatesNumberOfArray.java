package Array;
import java.util.*;
public class FindDuplicatesNumberOfArray {
    public static boolean Duplicates(int arr[]) {
        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (s1.contains(arr[i])) {
                return true;
            }
            s1.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,3,4,5};
        System.out.println(Duplicates(arr));
    }
}
