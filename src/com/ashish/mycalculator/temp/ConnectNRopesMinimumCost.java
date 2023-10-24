package com.ashish.mycalculator.temp;
import java.util.*;
public class ConnectNRopesMinimumCost {
    public static int Min(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        System.out.println(Min(arr));
    }
}
