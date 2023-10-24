package Array;
import java.util.*;
public class MinimumDiffernce {
    public static List<List<Integer>> MinDiff(int arr[]) {
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff,arr[i] - arr[i-1]);
        }
        for (int i = 1; i < n; i++) {
            if (arr[i]-arr[i-1] == minDiff) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {12,9,8,2,11};
        System.out.println(MinDiff(arr));
    }
}
