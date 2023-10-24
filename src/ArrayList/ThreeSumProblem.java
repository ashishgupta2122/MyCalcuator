package ArrayList;
import java.util.*;
public class ThreeSumProblem {
    public static List<List<Integer>> ThreeSum(int arr[],int target) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            int start = i+1;
            int end = n-1;
            while (start < end) {
                if (start > 0 && arr[start] == arr[start-1]) {
                    start++;
                    continue;
                }

                if (end < n-1 && arr[end] == arr[end+1]) {
                    end--;
                    continue;
                }

                if (arr[i] + arr[start] + arr[end] < target) {
                    start++;
                } else if(arr[i] + arr[start] + arr[end] > target) {
                    end--;
                } else {
//                    List<Integer> temp = new ArrayList<>();
                    ans.add(Arrays.asList(arr[i],arr[start],arr[end]));
                    start++;
                    end--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,2,2,1,1,1,-1,-3,0,1,2,3,3,3};
        int target = 0;
        List<List<Integer>> list = ThreeSum(arr,target);
        System.out.println(list);
    }
}
