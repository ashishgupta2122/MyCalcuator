package ArrayList;
import java.util.*;
public class TwoSumProblem {
    public static List<List<Integer>> Sum(int arr[],int target) {
        //2 Pointer Approach
        int start = 0;
        int end = arr.length-1;

        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        while (start < end) {
            if (start > 0 && arr[start] == arr[start-1]) {
                start++;
                continue;
            }

            if (end > arr.length-1 && arr[end] == arr[end+1]) {
                end--;
                continue;
            }

            if (arr[start] + arr[end] < target) {
                start++;
            } else if(arr[start] + arr[end] > target) {
                end--;
            } else {
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[start]);
                ans.add(arr[end]);
                list.add(ans);
                start++;
                end--;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,2,2,1,1,1,-1,-3,0,1,2,3,3,3};
        int target = 5;
        List<List<Integer>> ans = Sum(arr,target);
        System.out.println(ans);
    }
}
