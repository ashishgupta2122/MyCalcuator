package com.ashish.mycalculator;
import java.util.HashMap;
public class longest_subarray_having_sum_k_longest_subarray_having_sum_k {
    public static int longestSubArray(int arr[],int n,int key)
    {
        //// HashMap to store (sum, index) tuples
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        // traverse the given array
        for (int i = 0; i < n; i++)
        {
            // accumulate sum
            sum  += arr[i];
            // when subarray starts from index '0'
            if (sum == key)
            {
                maxLen = i + 1;
            }
            // make an entry for 'sum' if it is
            // not present in 'map'
            if (!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            // check if 'sum-k' is present in 'map'
            // or not
            if (map.containsKey(sum - key))
            {
                //update maxLength
                if (maxLen < (i - map.get(sum - key)));
                maxLen = i - map.get(sum - key);
            }
        }
        return maxLen;
    }
    // // Driver code
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int key = 15;
        System.out.println("Length = " + longestSubArray(arr,n,key));
    }
}
